package T1;

import y1.Z;
import y1.a0;

/* loaded from: classes.dex */
public final class n {
    public final m a;

    public n(m mVar) {
        this.a = mVar;
    }

    public final void a() throws Z {
        try {
            ((n) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(a0.class).newInstance(this.a)).a();
        } catch (Exception e7) {
            int i7 = Z.f18017k;
            if (!(e7 instanceof Z)) {
                throw new Z(e7);
            }
        }
    }
}
