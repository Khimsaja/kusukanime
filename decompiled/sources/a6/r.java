package a6;

import b6.L;
import java.io.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class r extends kotlinx.serialization.json.d {

    /* renamed from: k, reason: collision with root package name */
    public final boolean f10485k;

    /* renamed from: l, reason: collision with root package name */
    public final SerialDescriptor f10486l;

    /* renamed from: m, reason: collision with root package name */
    public final String f10487m;

    public r(Serializable serializable, boolean z7, SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.l.f("body", serializable);
        this.f10485k = z7;
        this.f10486l = serialDescriptor;
        this.f10487m = serializable.toString();
        if (serialDescriptor != null && !serialDescriptor.isInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @Override // kotlinx.serialization.json.d
    public final String a() {
        return this.f10487m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return this.f10485k == rVar.f10485k && kotlin.jvm.internal.l.a(this.f10487m, rVar.f10487m);
    }

    public final int hashCode() {
        return this.f10487m.hashCode() + (Boolean.hashCode(this.f10485k) * 31);
    }

    @Override // kotlinx.serialization.json.d
    public final String toString() {
        boolean z7 = this.f10485k;
        String str = this.f10487m;
        if (!z7) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        L.a(str, sb);
        return sb.toString();
    }
}
