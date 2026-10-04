package s;

import s0.C1953A;
import s0.C1963h;

/* renamed from: s.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1951z extends U3.i implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public C1963h f15410k;

    /* renamed from: l, reason: collision with root package name */
    public int f15411l;

    /* renamed from: m, reason: collision with root package name */
    public int f15412m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f15413n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f15414o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f15415p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1951z(kotlin.jvm.internal.x xVar, kotlin.jvm.internal.x xVar2, S3.c cVar) {
        super(2, cVar);
        this.f15414o = xVar;
        this.f15415p = xVar2;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C1951z c1951z = new C1951z(this.f15414o, this.f15415p, cVar);
        c1951z.f15413n = obj;
        return c1951z;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1951z) create((C1953A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c3 A[EDGE_INSN: B:66:0x00c3->B:41:0x00c3 BREAK  A[LOOP:0: B:36:0x00b0->B:40:0x00c0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a4 -> B:35:0x00a7). Please report as a decompilation issue!!! */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s.C1951z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
