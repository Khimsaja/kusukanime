package s;

import K2.C0298b;
import e4.InterfaceC0821a;
import s0.C1953A;

/* renamed from: s.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1895C extends U3.i implements e4.n {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f15070A;

    /* renamed from: k, reason: collision with root package name */
    public Object f15071k;

    /* renamed from: l, reason: collision with root package name */
    public Object f15072l;

    /* renamed from: m, reason: collision with root package name */
    public Object f15073m;

    /* renamed from: n, reason: collision with root package name */
    public kotlin.jvm.internal.w f15074n;

    /* renamed from: o, reason: collision with root package name */
    public C0298b f15075o;

    /* renamed from: p, reason: collision with root package name */
    public s0.r f15076p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f15077q;

    /* renamed from: r, reason: collision with root package name */
    public float f15078r;

    /* renamed from: s, reason: collision with root package name */
    public int f15079s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f15080t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f15081u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.w f15082v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EnumC1903a0 f15083w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f15084x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f15085y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f15086z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1895C(InterfaceC0821a interfaceC0821a, kotlin.jvm.internal.w wVar, EnumC1903a0 enumC1903a0, e4.o oVar, e4.n nVar, InterfaceC0821a interfaceC0821a2, e4.k kVar, S3.c cVar) {
        super(2, cVar);
        this.f15081u = (kotlin.jvm.internal.m) interfaceC0821a;
        this.f15082v = wVar;
        this.f15083w = enumC1903a0;
        this.f15084x = (kotlin.jvm.internal.m) oVar;
        this.f15085y = (kotlin.jvm.internal.m) nVar;
        this.f15086z = (kotlin.jvm.internal.m) interfaceC0821a2;
        this.f15070A = (kotlin.jvm.internal.m) kVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [e4.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r4v0, types: [e4.o, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r5v0, types: [e4.n, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r6v0, types: [e4.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r7v0, types: [e4.k, kotlin.jvm.internal.m] */
    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        ?? r62 = this.f15086z;
        ?? r7 = this.f15070A;
        C1895C c1895c = new C1895C(this.f15081u, this.f15082v, this.f15083w, this.f15084x, this.f15085y, r62, r7, cVar);
        c1895c.f15080t = obj;
        return c1895c;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1895C) create((C1953A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x02f8, code lost:
    
        if ((r4 != null ? r4 == s.EnumC1903a0.f15259k ? g0.c.e(r9) : g0.c.d(r9) : g0.c.c(r9)) == 0.0f) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e6, code lost:
    
        if (r10 == r1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0200, code lost:
    
        if (r9.b(r5, r21) == r1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0279, code lost:
    
        if (r9 == r1) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x017b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014a A[PHI: r2 r3 r4 r5 r7 r8 r9 r10 r11 r12 r14
      0x014a: PHI (r2v20 float) = (r2v21 float), (r2v35 float) binds: [B:39:0x0146, B:13:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x014a: PHI (r3v9 kotlin.jvm.internal.w) = (r3v25 kotlin.jvm.internal.w), (r3v0 kotlin.jvm.internal.w) binds: [B:39:0x0146, B:13:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x014a: PHI (r4v5 s0.i) = (r4v9 s0.i), (r4v0 s0.i) binds: [B:39:0x0146, B:13:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x014a: PHI (r5v4 java.lang.Object) = (r5v11 java.lang.Object), (r5v26 java.lang.Object) binds: [B:39:0x0146, B:13:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x014a: PHI (r7v4 s.a0) = (r7v7 s.a0), (r7v0 s.a0) binds: [B:39:0x0146, B:13:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x014a: PHI (r8v12 kotlin.jvm.internal.w) = (r8v14 kotlin.jvm.internal.w), (r8v24 kotlin.jvm.internal.w) binds: [B:39:0x0146, B:13:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x014a: PHI (r9v7 s0.A) = (r9v10 s0.A), (r9v31 s0.A) binds: [B:39:0x0146, B:13:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x014a: PHI (r10v11 s0.A) = (r10v14 s0.A), (r10v29 s0.A) binds: [B:39:0x0146, B:13:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x014a: PHI (r11v7 s0.r) = (r11v8 s0.r), (r11v21 s0.r) binds: [B:39:0x0146, B:13:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x014a: PHI (r12v3 K2.b) = (r12v4 K2.b), (r12v15 K2.b) binds: [B:39:0x0146, B:13:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x014a: PHI (r14v3 kotlin.jvm.internal.w) = (r14v4 kotlin.jvm.internal.w), (r14v15 kotlin.jvm.internal.w) binds: [B:39:0x0146, B:13:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x022a  */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r1v3, types: [e4.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r2v11, types: [e4.n, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r2v4, types: [e4.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [e4.o, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00fe -> B:31:0x0104). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x01b5 -> B:73:0x01da). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x01d6 -> B:73:0x01da). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0200 -> B:77:0x0204). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x0279 -> B:95:0x027c). Please report as a decompilation issue!!! */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 823
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s.C1895C.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
