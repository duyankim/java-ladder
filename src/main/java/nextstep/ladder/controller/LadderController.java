package nextstep.ladder.controller;

import nextstep.ladder.service.LadderService;
import nextstep.ladder.view.InputTable;

import java.util.List;

public final class LadderController {
    private final LadderService ladderService;

    public LadderController(LadderService ladderService) {
        this.ladderService = ladderService;
    }

    public void run() {
        List<String> participantNames = InputTable.insertParticipantNames();

    }
}
