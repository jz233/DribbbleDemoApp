package zjj.com.dribbbledemoapp.base;


import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public abstract class SimpleCallback implements Callback{
    @Override
    public void onFailure(Call call, IOException e) {
    }

    @Override
    public void onResponse(Call call, Response response) throws IOException {
        handleResponse(response);
    }

    protected abstract void handleResponse(Response response) throws IOException;
}
