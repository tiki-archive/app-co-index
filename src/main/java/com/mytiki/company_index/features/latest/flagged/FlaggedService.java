package com.mytiki.company_index.features.latest.flagged;

import io.sentry.Sentry;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class FlaggedService {
    private final FlaggedRepository flaggedRepository;

    public FlaggedService(FlaggedRepository flaggedRepository) {
        this.flaggedRepository = flaggedRepository;
    }

    public void save(String source, String sourceId, String reason){
        Sentry.captureMessage("FLAGGED " + source + "-" + sourceId + ": " + reason);
        FlaggedDO flagged = new FlaggedDO();
        flagged.setSourceId(sourceId);
        flagged.setReason(reason);
        flagged.setSource(source);
        flagged.setCreatedOn(ZonedDateTime.now(ZoneOffset.UTC));
        flaggedRepository.save(flagged);
    }
}
