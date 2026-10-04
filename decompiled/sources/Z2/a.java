package Z2;

import d3.C0801m;
import java.io.File;

/* loaded from: classes.dex */
public final class a implements b {
    public final boolean a;

    public a(boolean z7) {
        this.a = z7;
    }

    @Override // Z2.b
    public final String a(Object obj, C0801m c0801m) {
        File file = (File) obj;
        if (!this.a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
