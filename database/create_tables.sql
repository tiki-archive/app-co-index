/*
 * Copyright (c) TIKI Inc.
 * MIT license. See LICENSE file in root directory.
 */

-- -----------------------------------------------------------------------
-- HIBP
-- -----------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS hibp(
    name TEXT NOT NULL,
    domain TEXT NOT NULL,
    breached_on_utc TIMESTAMP WITH TIME ZONE NOT NULL,
    cached_on_utc TIMESTAMP WITH TIME ZONE NOT NULL,
    pwn_count INTEGER NOT NULL,
    pwn_score NUMERIC(8,5) NOT NULL,
    type_list TEXT NOT NULL,
    type_score NUMERIC(8,5) NOT NULL,
    class_list TEXT NOT NULL,
    class_score NUMERIC(8,5) NOT NULL,
    combo_score NUMERIC(8,5) NOT NULL,
    PRIMARY KEY(name)
);

-- -----------------------------------------------------------------------
-- COMPANY
-- -----------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS company(
    id BIGSERIAL NOT NULL,
    domain TEXT NOT NULL UNIQUE,
    name TEXT NOT NULL,
    description TEXT,
    logo TEXT,
    url TEXT,
    address TEXT,
    phone TEXT,
    sector TEXT,
    industry TEXT,
    sub_industry TEXT,
    tag_list TEXT,
    facebook_handle TEXT,
    twitter_handle TEXT,
    linkedin_handle TEXT,
    sensitivity_score NUMERIC(8,5) NOT NULL,
    cached_on_utc TIMESTAMP WITH TIME ZONE NOT NULL,
    PRIMARY KEY(id)
);

-- -----------------------------------------------------------------------
-- FLAGGED
-- -----------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS flagged(
    id BIGSERIAL NOT NULL,
    source TEXT NOT NULL,
    source_id TEXT NOT NULL,
    reason TEXT NOT NULL,
    created_on_utc TIMESTAMP WITH TIME ZONE NOT NULL,
    PRIMARY KEY(id)
);