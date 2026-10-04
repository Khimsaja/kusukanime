package D6;

import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* loaded from: classes.dex */
public final class P extends C0108b {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1684r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P(int i7) {
        super(7);
        this.f1684r = i7;
    }

    @Override // D6.C0108b
    public String d(Method method, int i7) {
        switch (this.f1684r) {
            case 1:
                Parameter parameter = method.getParameters()[i7];
                if (!parameter.isNamePresent()) {
                    break;
                } else {
                    break;
                }
        }
        return super.d(method, i7);
    }

    @Override // D6.C0108b
    public final Object e(Object obj, Method method, Object[] objArr) {
        switch (this.f1684r) {
            case 0:
                if (Build.VERSION.SDK_INT >= 26) {
                    return c0.k(obj, method, objArr);
                }
                throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
            default:
                return c0.k(obj, method, objArr);
        }
    }

    @Override // D6.C0108b
    public final boolean f(Method method) {
        switch (this.f1684r) {
        }
        return method.isDefault();
    }
}
