package H1;

import android.util.Base64;
import java.lang.reflect.InvocationTargetException;

/* renamed from: H1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0236q implements i3.h {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3557k;

    public /* synthetic */ C0236q(int i7) {
        this.f3557k = i7;
    }

    @Override // i3.h
    public final Object get() throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        switch (this.f3557k) {
            case 0:
                return new C0230k(new R1.f(), 50000, 50000, false, 0);
            case 1:
                byte[] bArr = new byte[12];
                I1.h.f3968i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 2:
                try {
                    Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    Object objInvoke = cls.getMethod("build", new Class[0]).invoke(cls.getConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]);
                    objInvoke.getClass();
                    return (y1.a0) objInvoke;
                } catch (Exception e7) {
                    throw new IllegalStateException(e7);
                }
            default:
                throw new IllegalStateException();
        }
    }
}
