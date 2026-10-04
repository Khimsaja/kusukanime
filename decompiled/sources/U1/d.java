package U1;

import H1.C0221b;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* loaded from: classes.dex */
public final class d implements SensorEventListener {
    public final float[] a = new float[16];

    /* renamed from: b, reason: collision with root package name */
    public final float[] f9136b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    public final float[] f9137c = new float[16];

    /* renamed from: d, reason: collision with root package name */
    public final float[] f9138d = new float[3];

    /* renamed from: e, reason: collision with root package name */
    public final Display f9139e;

    /* renamed from: f, reason: collision with root package name */
    public final c[] f9140f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9141g;

    public d(Display display, c... cVarArr) {
        this.f9139e = display;
        this.f9140f = cVarArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i7;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.a;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f9139e.getRotation();
        float[] fArr3 = this.f9136b;
        if (rotation != 0) {
            int i8 = 129;
            if (rotation != 1) {
                i7 = 130;
                if (rotation != 2) {
                    if (rotation != 3) {
                        throw new IllegalStateException();
                    }
                    i8 = 130;
                    i7 = 1;
                }
            } else {
                i7 = 129;
                i8 = 2;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i8, i7, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
        float[] fArr4 = this.f9138d;
        SensorManager.getOrientation(fArr3, fArr4);
        float f5 = fArr4[2];
        Matrix.rotateM(fArr2, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        boolean z7 = this.f9141g;
        float[] fArr5 = this.f9137c;
        if (!z7) {
            C0221b.c(fArr5, fArr2);
            this.f9141g = true;
        }
        System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr5, 0);
        c[] cVarArr = this.f9140f;
        for (int i9 = 0; i9 < 2; i9++) {
            cVarArr[i9].a(fArr2, f5);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
