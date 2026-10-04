package t5;

import io.ktor.http.ContentDisposition;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import z5.C2508m;

/* loaded from: classes.dex */
public final class i {
    public final W4.e a;

    /* renamed from: b, reason: collision with root package name */
    public final C2508m f16108b;

    /* renamed from: c, reason: collision with root package name */
    public final Collection f16109c;

    /* renamed from: d, reason: collision with root package name */
    public final e4.k f16110d;

    /* renamed from: e, reason: collision with root package name */
    public final e[] f16111e;

    public i(W4.e eVar, C2508m c2508m, Collection collection, e4.k kVar, e... eVarArr) {
        this.a = eVar;
        this.f16108b = c2508m;
        this.f16109c = collection;
        this.f16110d = kVar;
        this.f16111e = eVarArr;
    }

    public /* synthetic */ i(W4.e eVar, e[] eVarArr) {
        this(eVar, eVarArr, h.f16098l);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(W4.e eVar, e[] eVarArr, e4.k kVar) {
        this(eVar, null, null, kVar, (e[]) Arrays.copyOf(eVarArr, eVarArr.length));
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
    }

    public /* synthetic */ i(Set set, e[] eVarArr) {
        this(set, eVarArr, h.f16100n);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(Collection collection, e[] eVarArr, e4.k kVar) {
        this(null, null, collection, kVar, (e[]) Arrays.copyOf(eVarArr, eVarArr.length));
        kotlin.jvm.internal.l.f("nameList", collection);
    }
}
