package E;

import O3.C;
import U3.i;
import e4.n;
import s0.C1953A;
import s0.EnumC1964i;
import s0.r;

/* loaded from: classes.dex */
public final class a extends i implements n {

    /* renamed from: k, reason: collision with root package name */
    public r f1776k;

    /* renamed from: l, reason: collision with root package name */
    public EnumC1964i f1777l;

    /* renamed from: m, reason: collision with root package name */
    public int f1778m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f1779n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ d f1780o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, S3.c cVar) {
        super(2, cVar);
        this.f1780o = dVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        a aVar = new a(this.f1780o, cVar);
        aVar.f1779n = obj;
        return aVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((C1953A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
    
        if (r11 == r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bc, code lost:
    
        if (r8 != r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014d, code lost:
    
        if (r6 == r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014f, code lost:
    
        return r1;
     */
    /* JADX WARN: Path cross not found for [B:57:0x010e, B:55:0x00fd], limit reached: 86 */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00bc -> B:40:0x00c0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x014d -> B:68:0x0150). Please report as a decompilation issue!!! */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
