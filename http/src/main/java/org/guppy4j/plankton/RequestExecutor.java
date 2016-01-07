package org.guppy4j.plankton;

/**
 * Pluggable strategy for asynchronously executing requests.
 */
public interface RequestExecutor {

    void execute(Runnable code);

}
