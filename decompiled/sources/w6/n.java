package w6;

import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class n {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17164b;

    /* renamed from: c, reason: collision with root package name */
    public final y f17165c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f17166d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f17167e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f17168f;

    /* renamed from: g, reason: collision with root package name */
    public final Long f17169g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f17170h;

    public n(boolean z7, boolean z8, y yVar, Long l7, Long l8, Long l9, Long l10, Map map) {
        kotlin.jvm.internal.l.f("extras", map);
        this.a = z7;
        this.f17164b = z8;
        this.f17165c = yVar;
        this.f17166d = l7;
        this.f17167e = l8;
        this.f17168f = l9;
        this.f17169g = l10;
        this.f17170h = P3.E.s0(map);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.a) {
            arrayList.add("isRegularFile");
        }
        if (this.f17164b) {
            arrayList.add("isDirectory");
        }
        Long l7 = this.f17166d;
        if (l7 != null) {
            arrayList.add("byteCount=" + l7);
        }
        Long l8 = this.f17167e;
        if (l8 != null) {
            arrayList.add("createdAt=" + l8);
        }
        Long l9 = this.f17168f;
        if (l9 != null) {
            arrayList.add("lastModifiedAt=" + l9);
        }
        Long l10 = this.f17169g;
        if (l10 != null) {
            arrayList.add("lastAccessedAt=" + l10);
        }
        Map map = this.f17170h;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return P3.q.y0(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }

    public /* synthetic */ n(boolean z7, boolean z8, y yVar, Long l7, Long l8, Long l9, Long l10) {
        this(z7, z8, yVar, l7, l8, l9, l10, P3.z.f7780k);
    }
}
