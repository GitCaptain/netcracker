package model;

import controller.Group;
import controller.Instrument;
import controller.Room;
import controller.Session;

public interface DatabaseAPI {

    void createDatabase();

    Room[] getRooms();

    Instrument[] getInstruments();

    Group[] getGroups();

    void addRoom(Room room);

    void addInstrument(Instrument instrument);

    void addGroup(Group group);

    void addSession(Session session);

    void createTable();

    void fillTable();

}
