package dao;

import model.Camera;
import factory.CameraFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CameraDao {
    private static List<Camera> camere = new ArrayList<>();

    public List<Camera> getAll() {
        return camere;
    }

    public Camera read(int id) {
        return camere.stream()
                .filter(camera -> camera.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void create(int id, int etaj, boolean ocupata, boolean curata, boolean balcon) {
        Camera camera = CameraFactory.createCamera(id, etaj, ocupata, curata, balcon);
        camere.add(camera);
    }

    public void delete(int id) {
        camere = camere.stream()
                .filter(camera -> camera.getId() != id)
                .collect(Collectors.toList());
    }
}
