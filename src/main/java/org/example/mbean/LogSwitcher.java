package org.example.mbean;

import org.example.utils.LoggerForConsoleOutput;

import java.util.logging.Level;
import java.util.logging.Logger;


public class LogSwitcher implements LogSwitcherMBean {
    Logger logger = LoggerForConsoleOutput.getInstance().getLogger(false);

    @Override
    public void loggingOn() {
        Level info = Level.INFO;
        logger.setLevel(info);
    }

    @Override
    public void loggingOff() {
        Level off = Level.OFF;
        logger.setLevel(off);
    }
}

