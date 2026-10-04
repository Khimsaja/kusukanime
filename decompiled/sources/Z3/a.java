package Z3;

import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public final class a {
    public final File a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10248b;

    public a(File file, List list) {
        this.a = file;
        this.f10248b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && this.f10248b.equals(aVar.f10248b);
    }

    public final int hashCode() {
        return this.f10248b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilePathComponents(root=");
        sb.append(this.a);
        sb.append(", segments=");
        return A6.b.i(sb, this.f10248b, ')');
    }
}
