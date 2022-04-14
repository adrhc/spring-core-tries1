package ro.go.adrhc.model;

import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SomeConfig {
    private String name;
    private List<String> items;
    private Map<String, String> dictionary;
    private Room mainRoom;
    private List<Room> rooms;
}
