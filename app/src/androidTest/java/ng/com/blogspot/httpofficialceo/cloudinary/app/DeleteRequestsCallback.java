package ng.com.blogspot.httpofficialceo.cloudinary.app;

import com.cloudinary.android.sample.model.Resource;

public interface DeleteRequestsCallback {
    void onDeleteAllLocally();

    void onDeleteEverywhere();

    void onDeleteResourceLocally(Resource resource);

    void onDeleteResourceEverywhere(Resource resource);
}
