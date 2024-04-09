package daoservices;

import model.Camera;
import dao.CameraDao;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class CameraRepositoryService {

    private CameraDao cameraDao;

    public CameraRepositoryService() {
        cameraDao = new CameraDao();
    }

    public Camera getCameraById(int id) {
        Camera camera = cameraDao.read(id);
        if (camera != null) {
            System.out.println(camera);
        } else {
            System.out.println("Camera cu id-ul " + id + " nu exista");
        }
        return camera;
    }

    public List<Camera> sortCameraByPret() {
        List<Camera> camereSortate = cameraDao.getAll();
        camereSortate.sort(Comparator.comparingInt(Camera::calculeazaPretPeNoapte));
        return camereSortate;
    }

    public void addCamera(int id, int etaj, boolean ocupata, boolean curata, boolean balcon) {
        cameraDao.create(id, etaj, ocupata, curata, balcon);
    }

    public void deleteCamera(int id) {
        Camera camera = getCameraById(id);
        if (camera != null) {
            cameraDao.delete(id);
            System.out.println("Camera cu id-ul " + id + " a fost stearsa");
        }
    }

}
