package u4;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: u4.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2119z extends S {
    public final ArrayList a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f16347b;

    public C2119z(ArrayList arrayList) {
        this.a = arrayList;
        this.f16347b = P3.E.r0(arrayList);
    }

    @Override // u4.S
    public final boolean a(W4.e eVar) {
        return this.f16347b.containsKey(eVar);
    }

    public final String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + this.a + ')';
    }
}
