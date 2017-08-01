package linear.com.nida;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

/**
 * Created by Administrator on 8/1/2017.
 */

public class MyService extends Service{
    MediaPlayer mp;

    @Override
    public IBinder onBind(Intent arg0) {
        //TODO Auto-generated method stub
        return null;
    }
    @Override
    public void onCreate(){
        mp=MediaPlayer.create(this, R.raw.beraksi);
        mp.setLooping(false);
    }
    public void onStart(Intent intent,int startId){
        mp.start();
    }
    @Override
    public void onDestroy(){
        mp.stop();
    }
}
