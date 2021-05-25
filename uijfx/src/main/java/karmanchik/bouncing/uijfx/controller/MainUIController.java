package karmanchik.bouncing.uijfx.controller;

import karmanchik.bounching.clientapi.daos.AgentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

@Log4j2
@Component
@RequiredArgsConstructor
public class MainUIController extends AbstractUIController {
    private final AgentRepository agentRepository;

    @Override
    protected void postShow() {

    }

    @Override
    protected void preShow() {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        log.info(agentRepository.findAll(Sort.by("title")));
    }
}
