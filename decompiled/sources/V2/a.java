package V2;

import H5.M;
import android.os.StatFs;
import java.io.File;
import w6.o;
import w6.v;
import w6.y;

/* loaded from: classes.dex */
public final class a {
    public y a;

    /* renamed from: b, reason: collision with root package name */
    public final v f9440b = o.f17171k;

    /* renamed from: c, reason: collision with root package name */
    public double f9441c = 0.02d;

    /* renamed from: d, reason: collision with root package name */
    public final long f9442d = 10485760;

    /* renamed from: e, reason: collision with root package name */
    public final long f9443e = 262144000;

    /* renamed from: f, reason: collision with root package name */
    public long f9444f;

    /* renamed from: g, reason: collision with root package name */
    public final O5.d f9445g;

    public a() {
        O5.e eVar = M.a;
        this.f9445g = O5.d.f7623l;
    }

    public final j a() {
        long jL;
        y yVar = this.a;
        if (yVar == null) {
            throw new IllegalStateException("directory == null");
        }
        if (this.f9441c > 0.0d) {
            try {
                File fileE = yVar.e();
                fileE.mkdir();
                StatFs statFs = new StatFs(fileE.getAbsolutePath());
                jL = e3.c.l((long) (this.f9441c * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.f9442d, this.f9443e);
            } catch (Exception unused) {
                jL = this.f9442d;
            }
        } else {
            jL = this.f9444f;
        }
        return new j(jL, this.f9445g, this.f9440b, yVar);
    }
}
