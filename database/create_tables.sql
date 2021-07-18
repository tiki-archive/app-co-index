/*
 * Copyright (c) TIKI Inc.
 * MIT license. See LICENSE file in root directory.
 */

-- -----------------------------------------------------------------------
-- HIBP
-- -----------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS hibp(
    id BIGSERIAL NOT NULL,
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
    PRIMARY KEY(id)
);