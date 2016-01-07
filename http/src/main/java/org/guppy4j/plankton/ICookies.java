package org.guppy4j.plankton;

/**
 * Created by oliver on 06/01/16.
 */
public interface ICookies extends Iterable<String> {

    String read(String name);

    void set(String name, String value, int expires);

    void set(ICookie cookie);

    void delete(String name);

    void unloadQueue(IResponse response);
}
