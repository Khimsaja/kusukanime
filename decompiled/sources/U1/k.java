package U1;

import B1.w;
import T1.q;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class k extends GLSurfaceView {

    /* renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArrayList f9179k;

    /* renamed from: l, reason: collision with root package name */
    public final SensorManager f9180l;

    /* renamed from: m, reason: collision with root package name */
    public final Sensor f9181m;

    /* renamed from: n, reason: collision with root package name */
    public final d f9182n;

    /* renamed from: o, reason: collision with root package name */
    public final Handler f9183o;

    /* renamed from: p, reason: collision with root package name */
    public final i f9184p;

    /* renamed from: q, reason: collision with root package name */
    public SurfaceTexture f9185q;

    /* renamed from: r, reason: collision with root package name */
    public Surface f9186r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f9187s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f9188t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9189u;

    public k(Context context) {
        super(context, null);
        this.f9179k = new CopyOnWriteArrayList();
        this.f9183o = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f9180l = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.f9181m = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.f9184p = iVar;
        j jVar = new j(this, iVar);
        View.OnTouchListener lVar = new l(context, jVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f9182n = new d(windowManager.getDefaultDisplay(), lVar, jVar);
        this.f9187s = true;
        setEGLContextClientVersion(2);
        setRenderer(jVar);
        setOnTouchListener(lVar);
    }

    public final void a() {
        boolean z7 = this.f9187s && this.f9188t;
        Sensor sensor = this.f9181m;
        if (sensor == null || z7 == this.f9189u) {
            return;
        }
        d dVar = this.f9182n;
        SensorManager sensorManager = this.f9180l;
        if (z7) {
            sensorManager.registerListener(dVar, sensor, 0);
        } else {
            sensorManager.unregisterListener(dVar);
        }
        this.f9189u = z7;
    }

    public a getCameraMotionListener() {
        return this.f9184p;
    }

    public q getVideoFrameMetadataListener() {
        return this.f9184p;
    }

    public Surface getVideoSurface() {
        return this.f9186r;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9183o.post(new w(12, this));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f9188t = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f9188t = true;
        a();
    }

    public void setDefaultStereoMode(int i7) {
        this.f9184p.f9166u = i7;
    }

    public void setUseSensorRotation(boolean z7) {
        this.f9187s = z7;
        a();
    }
}
