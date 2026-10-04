package O;

import K5.InterfaceC0330i;
import e4.InterfaceC0821a;
import m.C1472B;

/* loaded from: classes.dex */
public final class P0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public C1472B f7031k;

    /* renamed from: l, reason: collision with root package name */
    public e4.k f7032l;

    /* renamed from: m, reason: collision with root package name */
    public J5.i f7033m;

    /* renamed from: n, reason: collision with root package name */
    public C2.G f7034n;

    /* renamed from: o, reason: collision with root package name */
    public Object f7035o;

    /* renamed from: p, reason: collision with root package name */
    public int f7036p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f7037q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f7038r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(S3.c cVar, InterfaceC0821a interfaceC0821a) {
        super(2, cVar);
        this.f7038r = interfaceC0821a;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        P0 p02 = new P0(cVar, this.f7038r);
        p02.f7037q = obj;
        return p02;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((P0) create((InterfaceC0330i) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
        return T3.a.f9048k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x01a2, code lost:
    
        r6 = r18;
        r2 = r19;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0165 A[EDGE_INSN: B:126:0x0165->B:70:0x0165 BREAK  A[LOOP:0: B:38:0x00dd->B:97:0x01bf], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00da A[Catch: all -> 0x0027, PHI: r0 r2 r4 r5 r6 r7 r8 r9 r10 r11
      0x00da: PHI (r0v6 int) = (r0v27 int), (r0v0 int) binds: [B:34:0x00d6, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x00da: PHI (r2v1 boolean) = (r2v12 boolean), (r2v0 boolean) binds: [B:34:0x00d6, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x00da: PHI (r4v9 java.lang.Object) = (r4v12 java.lang.Object), (r4v15 java.lang.Object) binds: [B:34:0x00d6, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x00da: PHI (r5v1 int) = (r5v15 int), (r5v0 int) binds: [B:34:0x00d6, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x00da: PHI (r6v8 C2.G) = (r6v24 C2.G), (r6v27 C2.G) binds: [B:34:0x00d6, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x00da: PHI (r7v2 J5.i) = (r7v3 J5.i), (r7v6 J5.i) binds: [B:34:0x00d6, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x00da: PHI (r8v1 e4.k) = (r8v2 e4.k), (r8v5 e4.k) binds: [B:34:0x00d6, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x00da: PHI (r9v1 m.B) = (r9v2 m.B), (r9v5 m.B) binds: [B:34:0x00d6, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x00da: PHI (r10v2 K5.i) = (r10v3 K5.i), (r10v8 K5.i) binds: [B:34:0x00d6, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x00da: PHI (r11v4 java.lang.Object) = (r11v9 java.lang.Object), (r11v10 java.lang.Object) binds: [B:34:0x00d6, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {all -> 0x0027, blocks: (B:8:0x001f, B:33:0x00c4, B:36:0x00da, B:79:0x0192, B:95:0x01bb, B:96:0x01be, B:15:0x0040, B:18:0x0055, B:25:0x0095, B:29:0x00aa, B:102:0x01ce, B:103:0x01d1, B:26:0x009f, B:28:0x00a7, B:99:0x01c9, B:100:0x01cc), top: B:113:0x0009, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0167 A[Catch: all -> 0x01a8, TRY_LEAVE, TryCatch #5 {all -> 0x01a8, blocks: (B:50:0x011f, B:68:0x0158, B:71:0x0167, B:75:0x017f, B:77:0x0188, B:54:0x012a, B:60:0x0139), top: B:118:0x011f }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01bf A[LOOP:0: B:38:0x00dd->B:97:0x01bf, LOOP_END] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x01a1 -> B:83:0x01a2). Please report as a decompilation issue!!! */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O.P0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
