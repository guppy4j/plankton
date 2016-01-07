package org.guppy4j.plankton;

/**
 * Listens to a port
 */
public interface IPortListener {

    int getListeningPort();

    boolean isAlive();
}
