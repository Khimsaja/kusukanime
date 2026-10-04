package androidx.compose.foundation.text.modifiers;

import G.g;
import H0.I;
import M0.i;
import a0.p;
import b1.AbstractC0703b;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import p.AbstractC1755i;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;", "Ly0/S;", "LG/g;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextStringSimpleElement extends S {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final I f10632b;

    /* renamed from: c, reason: collision with root package name */
    public final i f10633c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10634d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10635e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10636f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10637g;

    public TextStringSimpleElement(String str, I i7, i iVar, int i8, boolean z7, int i9, int i10) {
        this.a = str;
        this.f10632b = i7;
        this.f10633c = iVar;
        this.f10634d = i8;
        this.f10635e = z7;
        this.f10636f = i9;
        this.f10637g = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        textStringSimpleElement.getClass();
        return l.a(this.a, textStringSimpleElement.a) && l.a(this.f10632b, textStringSimpleElement.f10632b) && l.a(this.f10633c, textStringSimpleElement.f10633c) && this.f10634d == textStringSimpleElement.f10634d && this.f10635e == textStringSimpleElement.f10635e && this.f10636f == textStringSimpleElement.f10636f && this.f10637g == textStringSimpleElement.f10637g;
    }

    @Override // y0.S
    public final p h() {
        g gVar = new g();
        gVar.f2592x = this.a;
        gVar.f2593y = this.f10632b;
        gVar.f2594z = this.f10633c;
        gVar.f2584A = this.f10634d;
        gVar.f2585B = this.f10635e;
        gVar.f2586C = this.f10636f;
        gVar.f2587D = this.f10637g;
        return gVar;
    }

    public final int hashCode() {
        return (((AbstractC0703b.d(AbstractC1755i.a(this.f10634d, (this.f10633c.hashCode() + ((this.f10632b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31), 31, this.f10635e) + this.f10636f) * 31) + this.f10637g) * 31;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // y0.S
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(a0.p r14) {
        /*
            r13 = this;
            G.g r14 = (G.g) r14
            r14.getClass()
            H0.I r0 = r14.f2593y
            r1 = 0
            r2 = 1
            H0.I r3 = r13.f10632b
            if (r3 == r0) goto L1a
            H0.B r4 = r3.a
            H0.B r0 = r0.a
            boolean r0 = r4.b(r0)
            if (r0 == 0) goto L18
            goto L1d
        L18:
            r0 = r2
            goto L1e
        L1a:
            r3.getClass()
        L1d:
            r0 = r1
        L1e:
            java.lang.String r4 = r14.f2592x
            java.lang.String r5 = r13.a
            boolean r4 = kotlin.jvm.internal.l.a(r4, r5)
            r6 = 0
            if (r4 == 0) goto L2b
            r4 = r1
            goto L30
        L2b:
            r14.f2592x = r5
            r14.f2591H = r6
            r4 = r2
        L30:
            H0.I r5 = r14.f2593y
            boolean r5 = r5.c(r3)
            r5 = r5 ^ r2
            r14.f2593y = r3
            int r3 = r14.f2587D
            int r7 = r13.f10637g
            if (r3 == r7) goto L42
            r14.f2587D = r7
            r5 = r2
        L42:
            int r3 = r14.f2586C
            int r7 = r13.f10636f
            if (r3 == r7) goto L4b
            r14.f2586C = r7
            r5 = r2
        L4b:
            boolean r3 = r14.f2585B
            boolean r7 = r13.f10635e
            if (r3 == r7) goto L54
            r14.f2585B = r7
            r5 = r2
        L54:
            M0.i r3 = r14.f2594z
            M0.i r7 = r13.f10633c
            boolean r3 = kotlin.jvm.internal.l.a(r3, r7)
            if (r3 != 0) goto L61
            r14.f2594z = r7
            r5 = r2
        L61:
            int r3 = r14.f2584A
            int r7 = r13.f10634d
            if (r3 != r7) goto L69
            r2 = r5
            goto L6b
        L69:
            r14.f2584A = r7
        L6b:
            if (r4 != 0) goto L6f
            if (r2 == 0) goto La8
        L6f:
            G.d r3 = r14.G0()
            java.lang.String r5 = r14.f2592x
            H0.I r7 = r14.f2593y
            M0.i r8 = r14.f2594z
            int r9 = r14.f2584A
            boolean r10 = r14.f2585B
            int r11 = r14.f2586C
            int r12 = r14.f2587D
            r3.a = r5
            r3.f2562b = r7
            r3.f2563c = r8
            r3.f2564d = r9
            r3.f2565e = r10
            r3.f2566f = r11
            r3.f2567g = r12
            r3.f2570j = r6
            r3.f2574n = r6
            r3.f2575o = r6
            r5 = -1
            r3.f2577q = r5
            r3.f2578r = r5
            long r5 = q0.c.x(r1, r1, r1, r1)
            r3.f2576p = r5
            long r5 = l4.AbstractC1420H.a(r1, r1)
            r3.f2572l = r5
            r3.f2571k = r1
        La8:
            boolean r1 = r14.f10414w
            if (r1 != 0) goto Lad
            goto Lc7
        Lad:
            if (r4 != 0) goto Lb5
            if (r0 == 0) goto Lb8
            G.f r1 = r14.f2590G
            if (r1 == 0) goto Lb8
        Lb5:
            y0.AbstractC2359f.p(r14)
        Lb8:
            if (r4 != 0) goto Lbc
            if (r2 == 0) goto Lc2
        Lbc:
            y0.AbstractC2359f.o(r14)
            y0.AbstractC2359f.n(r14)
        Lc2:
            if (r0 == 0) goto Lc7
            y0.AbstractC2359f.n(r14)
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextStringSimpleElement.m(a0.p):void");
    }
}
