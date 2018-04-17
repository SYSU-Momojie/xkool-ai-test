package ai.xkool.sc.controller;

import ai.xkool.sc.input.UserInput;

import java.util.Queue;

/**
 * To accept player command,
 * should listen to system event and convert to UserInput
 */
public abstract class InputController {

    /**
     * Message queue.
     * Store UserInput and wait for execution
     */
    private Queue<UserInput> mq;

    /**
     * Convert system input to UserInput,
     * and put it to message queue, wait for execution
     *
     * @param input
     */
    abstract void onSystemInput(Object input);
}
