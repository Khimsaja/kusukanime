package k;

import androidx.lifecycle.C0695w;
import androidx.lifecycle.InterfaceC0693u;
import java.util.Map;

/* renamed from: k.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1371c implements Map.Entry {

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC0693u f12554k;

    /* renamed from: l, reason: collision with root package name */
    public final C0695w f12555l;

    /* renamed from: m, reason: collision with root package name */
    public C1371c f12556m;

    /* renamed from: n, reason: collision with root package name */
    public C1371c f12557n;

    public C1371c(InterfaceC0693u interfaceC0693u, C0695w c0695w) {
        this.f12554k = interfaceC0693u;
        this.f12555l = c0695w;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1371c)) {
            return false;
        }
        C1371c c1371c = (C1371c) obj;
        return this.f12554k.equals(c1371c.f12554k) && this.f12555l.equals(c1371c.f12555l);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f12554k;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f12555l;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f12554k.hashCode() ^ this.f12555l.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f12554k + "=" + this.f12555l;
    }
}
