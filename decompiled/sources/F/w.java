package F;

import B1.AbstractC0015b;
import B1.C0014a;
import B1.C0023j;
import B1.H;
import B1.K;
import C2.I;
import D.P0;
import D6.C0122p;
import D6.InterfaceC0111e;
import D6.InterfaceC0113g;
import D6.InterfaceC0114h;
import D6.RunnableC0121o;
import D6.V;
import D6.c0;
import H5.AbstractC0281w;
import K2.W;
import K2.b0;
import K2.e0;
import K2.f0;
import V1.AbstractC0597b;
import V1.InterfaceC0603h;
import android.content.Context;
import android.media.MediaCodec;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.C0685l;
import f6.C0895I;
import f6.InterfaceC0908f;
import f6.InterfaceC0909g;
import io.ktor.http.ContentDisposition;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import l4.InterfaceC1443v;
import m.AbstractC1493n;
import m.C1477G;
import m.C1492m;
import m5.C1523l;
import s2.InterfaceC1982j;
import w6.AbstractC2217b;
import w6.C2224i;
import y1.C2392n;
import y1.C2393o;

/* loaded from: classes.dex */
public final class w implements A5.i, InterfaceC1982j, InterfaceC0603h, C2.E, InterfaceC0113g, InterfaceC0114h, InterfaceC0909g, E1.g, F3.b, H4.A, J0.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2036k;

    /* renamed from: l, reason: collision with root package name */
    public Object f2037l;

    /* renamed from: m, reason: collision with root package name */
    public Object f2038m;

    public /* synthetic */ w(int i7, Object obj) {
        this.f2036k = i7;
        this.f2037l = obj;
    }

    public static int A(int i7, int i8) {
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            i9++;
            if (i9 == i8) {
                i10++;
                i9 = 0;
            } else if (i9 > i8) {
                i10++;
                i9 = 1;
            }
        }
        return i9 + 1 > i8 ? i10 + 1 : i10;
    }

    public static w E(String... strArr) {
        try {
            w6.l[] lVarArr = new w6.l[strArr.length];
            C2224i c2224i = new C2224i();
            for (int i7 = 0; i7 < strArr.length; i7++) {
                G3.o.L(c2224i, strArr[i7]);
                c2224i.readByte();
                lVarArr[i7] = c2224i.T(c2224i.f17156l);
            }
            return new w(17, (String[]) strArr.clone(), AbstractC2217b.f(lVarArr));
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    public boolean B(Object obj, InterfaceC1443v interfaceC1443v) {
        kotlin.jvm.internal.l.f("property", interfaceC1443v);
        int iIntValue = ((Number) ((kotlin.jvm.internal.o) this.f2037l).get(obj)).intValue();
        C1.i iVar = (C1.i) this.f2038m;
        return ((iIntValue >>> iVar.a) & ((1 << iVar.f580b) - 1)) == iVar.f581c;
    }

    public void C() {
        ((SparseIntArray) this.f2037l).clear();
    }

    public boolean D(View view) {
        K2.F f5 = (K2.F) this.f2037l;
        int iD = f5.d();
        int iC = f5.c();
        int iB = f5.b(view);
        int iA = f5.a(view);
        e0 e0Var = (e0) this.f2038m;
        e0Var.f4585b = iD;
        e0Var.f4586c = iC;
        e0Var.f4587d = iB;
        e0Var.f4588e = iA;
        e0Var.a = 24579;
        return e0Var.a();
    }

    public void F(int i7, int i8) {
        int[] iArr = (int[]) this.f2037l;
        if (iArr == null || i7 >= iArr.length) {
            return;
        }
        int i9 = i7 + i8;
        v(i9);
        int[] iArr2 = (int[]) this.f2037l;
        System.arraycopy(iArr2, i7, iArr2, i9, (iArr2.length - i7) - i8);
        Arrays.fill((int[]) this.f2037l, i7, i9, -1);
        ArrayList arrayList = (ArrayList) this.f2038m;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b0 b0Var = (b0) ((ArrayList) this.f2038m).get(size);
            int i10 = b0Var.f4553k;
            if (i10 >= i7) {
                b0Var.f4553k = i10 + i8;
            }
        }
    }

    public void G(int i7, int i8) {
        int[] iArr = (int[]) this.f2037l;
        if (iArr == null || i7 >= iArr.length) {
            return;
        }
        int i9 = i7 + i8;
        v(i9);
        int[] iArr2 = (int[]) this.f2037l;
        System.arraycopy(iArr2, i9, iArr2, i7, (iArr2.length - i7) - i8);
        int[] iArr3 = (int[]) this.f2037l;
        Arrays.fill(iArr3, iArr3.length - i8, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f2038m;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b0 b0Var = (b0) ((ArrayList) this.f2038m).get(size);
            int i10 = b0Var.f4553k;
            if (i10 >= i7) {
                if (i10 < i9) {
                    ((ArrayList) this.f2038m).remove(size);
                } else {
                    b0Var.f4553k = i10 - i8;
                }
            }
        }
    }

    public P0 H(W w7, int i7) {
        f0 f0Var;
        P0 p02;
        C1477G c1477g = (C1477G) this.f2037l;
        int iC = c1477g.c(w7);
        if (iC >= 0 && (f0Var = (f0) c1477g.h(iC)) != null) {
            int i8 = f0Var.a;
            if ((i8 & i7) != 0) {
                int i9 = i8 & (~i7);
                f0Var.a = i9;
                if (i7 == 4) {
                    p02 = f0Var.f4594b;
                } else {
                    if (i7 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    p02 = f0Var.f4595c;
                }
                if ((i9 & 12) == 0) {
                    c1477g.f(iC);
                    f0Var.a = 0;
                    f0Var.f4594b = null;
                    f0Var.f4595c = null;
                    f0.f4593d.t(f0Var);
                }
                return p02;
            }
        }
        return null;
    }

    public Object I(String str, String str2, S3.c cVar) {
        Object objG = H5.D.G((AbstractC0281w) this.f2038m, new F3.e(this, str, str2, null), cVar);
        return objG == T3.a.f9048k ? objG : O3.C.a;
    }

    public void J(String str, L2.d dVar) {
        kotlin.jvm.internal.l.f("provider", dVar);
        M2.a aVar = (M2.a) this.f2037l;
        synchronized (((A.e) aVar.f6545f)) {
            if (((LinkedHashMap) aVar.f6546g).containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            ((LinkedHashMap) aVar.f6546g).put(str, dVar);
        }
    }

    public Object K(String str, S3.c cVar) {
        Object objG = H5.D.G((AbstractC0281w) this.f2038m, new F3.f(this, str, null), cVar);
        return objG == T3.a.f9048k ? objG : O3.C.a;
    }

    public void L(W w7) {
        f0 f0Var = (f0) ((C1477G) this.f2037l).get(w7);
        if (f0Var == null) {
            return;
        }
        f0Var.a &= -2;
    }

    public void M(W w7) {
        C1492m c1492m = (C1492m) this.f2038m;
        int iF = c1492m.f() - 1;
        while (true) {
            if (iF < 0) {
                break;
            }
            if (w7 == c1492m.g(iF)) {
                Object[] objArr = c1492m.f12896m;
                Object obj = objArr[iF];
                Object obj2 = AbstractC1493n.a;
                if (obj != obj2) {
                    objArr[iF] = obj2;
                    c1492m.f12894k = true;
                }
            } else {
                iF--;
            }
        }
        f0 f0Var = (f0) ((C1477G) this.f2037l).remove(w7);
        if (f0Var != null) {
            f0Var.a = 0;
            f0Var.f4594b = null;
            f0Var.f4595c = null;
            f0.f4593d.t(f0Var);
        }
    }

    public void N() throws NoSuchMethodException, SecurityException {
        if (!((M2.a) this.f2037l).f6542c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        L2.a aVar = (L2.a) this.f2038m;
        if (aVar == null) {
            aVar = new L2.a(this);
        }
        this.f2038m = aVar;
        try {
            C0685l.class.getDeclaredConstructor(new Class[0]);
            L2.a aVar2 = (L2.a) this.f2038m;
            if (aVar2 != null) {
                aVar2.a.add(C0685l.class.getName());
            }
        } catch (NoSuchMethodException e7) {
            throw new IllegalArgumentException("Class " + C0685l.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e7);
        }
    }

    public C0014a O() throws IOException {
        File file = (File) this.f2037l;
        if (file.exists()) {
            File file2 = (File) this.f2038m;
            if (file2.exists()) {
                file.delete();
            } else if (!file.renameTo(file2)) {
                AbstractC0015b.v("AtomicFile", "Couldn't rename file " + file + " to backup file " + file2);
            }
        }
        try {
            return new C0014a(file);
        } catch (FileNotFoundException e7) {
            File parentFile = file.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + file, e7);
            }
            try {
                return new C0014a(file);
            } catch (FileNotFoundException e8) {
                throw new IOException("Couldn't create " + file, e8);
            }
        }
    }

    @Override // D6.InterfaceC0114h
    public void a(InterfaceC0111e interfaceC0111e, Throwable th) {
        ((C0122p) this.f2038m).f1757k.execute(new RunnableC0121o(this, (InterfaceC0114h) this.f2037l, th, 1));
    }

    @Override // C2.E
    public void b(B1.B b4) {
        if (b4.t() != 0 || (b4.t() & 128) == 0) {
            return;
        }
        b4.G(6);
        int iA = b4.a() / 4;
        int i7 = 0;
        while (true) {
            I i8 = (I) this.f2038m;
            if (i7 >= iA) {
                i8.getClass();
                i8.f674g.remove(0);
                return;
            }
            B1.A a = (B1.A) this.f2037l;
            b4.e(a.f281b, 0, 4);
            a.q(0);
            int i9 = a.i(16);
            a.t(3);
            if (i9 == 0) {
                a.t(13);
            } else {
                int i10 = a.i(13);
                if (i8.f674g.get(i10) == null) {
                    i8.f674g.put(i10, new C2.F(new C0023j(i8, i10)));
                    i8.f680m++;
                }
            }
            i7++;
        }
    }

    @Override // D6.InterfaceC0114h
    public void d(InterfaceC0111e interfaceC0111e, V v5) {
        ((C0122p) this.f2038m).f1757k.execute(new RunnableC0121o(this, (InterfaceC0114h) this.f2037l, v5, 0));
    }

    @Override // D6.InterfaceC0113g
    public Object e(D6.D d4) {
        Executor executor = (Executor) this.f2038m;
        return executor == null ? d4 : new C0122p(executor, d4);
    }

    @Override // J0.e
    public int f(int i7) {
        do {
            B1.G g4 = (B1.G) this.f2038m;
            g4.b(i7);
            i7 = ((BreakIterator) g4.f296e).preceding(i7);
            if (i7 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f2037l).charAt(i7)));
        return i7;
    }

    @Override // J0.e
    public int g(int i7) {
        do {
            B1.G g4 = (B1.G) this.f2038m;
            g4.b(i7);
            i7 = ((BreakIterator) g4.f296e).following(i7);
            if (i7 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f2037l).charAt(i7 - 1)));
        return i7;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:39:0x00e3
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // V1.InterfaceC0603h
    public V1.C0602g i(V1.k r17, long r18) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F.w.i(V1.k, long):V1.g");
    }

    @Override // D6.InterfaceC0113g
    public Type j() {
        return (Type) this.f2037l;
    }

    @Override // E1.g
    public E1.h k() {
        return new E1.l((Context) this.f2037l, ((E1.m) this.f2038m).k());
    }

    @Override // V1.InterfaceC0603h
    public void l() {
        byte[] bArr = K.f302c;
        B1.B b4 = (B1.B) this.f2038m;
        b4.getClass();
        b4.D(bArr, bArr.length);
    }

    @Override // A5.i
    public A5.d m() {
        throw new A5.e(((String) this.f2037l) + " when parsing an Instant from \"" + A5.g.p(64, (String) this.f2038m) + '\"', 0);
    }

    @Override // J0.e
    public int n(int i7) {
        CharSequence charSequence;
        do {
            B1.G g4 = (B1.G) this.f2038m;
            g4.b(i7);
            i7 = ((BreakIterator) g4.f296e).following(i7);
            if (i7 != -1) {
                charSequence = (CharSequence) this.f2037l;
                if (i7 == charSequence.length()) {
                }
            }
            return -1;
        } while (Character.isWhitespace(charSequence.charAt(i7)));
        return i7;
    }

    @Override // J0.e
    public int o(int i7) {
        do {
            B1.G g4 = (B1.G) this.f2038m;
            g4.b(i7);
            i7 = ((BreakIterator) g4.f296e).preceding(i7);
            if (i7 == -1 || i7 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f2037l).charAt(i7 - 1)));
        return i7;
    }

    @Override // f6.InterfaceC0909g
    public void onFailure(InterfaceC0908f interfaceC0908f, IOException iOException) {
        try {
            ((InterfaceC0114h) this.f2037l).a((D6.D) this.f2038m, iOException);
        } catch (Throwable th) {
            c0.s(th);
            th.printStackTrace();
        }
    }

    @Override // f6.InterfaceC0909g
    public void onResponse(InterfaceC0908f interfaceC0908f, C0895I c0895i) {
        InterfaceC0114h interfaceC0114h = (InterfaceC0114h) this.f2037l;
        D6.D d4 = (D6.D) this.f2038m;
        try {
            try {
                interfaceC0114h.d(d4, d4.c(c0895i));
            } catch (Throwable th) {
                c0.s(th);
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            c0.s(th2);
            try {
                interfaceC0114h.a(d4, th2);
            } catch (Throwable th3) {
                c0.s(th3);
                th3.printStackTrace();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:203:0x03a6, code lost:
    
        r0.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0123, code lost:
    
        r3 = r5;
        r1 = 2;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0365 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    @Override // s2.InterfaceC1982j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(byte[] r20, int r21, int r22, s2.C1981i r23, B1.InterfaceC0021h r24) {
        /*
            Method dump skipped, instructions count: 1068
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F.w.p(byte[], int, int, s2.i, B1.h):void");
    }

    public void q(W w7, P0 p02) {
        C1477G c1477g = (C1477G) this.f2037l;
        f0 f0VarA = (f0) c1477g.get(w7);
        if (f0VarA == null) {
            f0VarA = f0.a();
            c1477g.put(w7, f0VarA);
        }
        f0VarA.f4595c = p02;
        f0VarA.a |= 8;
    }

    public void r() {
        switch (this.f2036k) {
            case 18:
                this.f2037l = null;
                this.f2038m = null;
                break;
            default:
                int[] iArr = (int[]) this.f2037l;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                this.f2038m = null;
                break;
        }
    }

    public void s(long j7, B1.B b4) {
        if (b4.a() < 9) {
            return;
        }
        int iG = b4.g();
        int iG2 = b4.g();
        int iT = b4.t();
        if (iG == 434 && iG2 == 1195456820 && iT == 3) {
            AbstractC0597b.e(j7, b4, (V1.G[]) this.f2038m);
        }
    }

    public Bundle t(String str) {
        kotlin.jvm.internal.l.f("key", str);
        M2.a aVar = (M2.a) this.f2037l;
        if (!aVar.f6541b) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = (Bundle) aVar.f6547h;
        if (bundle == null) {
            return null;
        }
        Bundle bundleC = bundle.containsKey(str) ? P3.r.C(str, bundle) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            aVar.f6547h = null;
        }
        return bundleC;
    }

    public String toString() {
        switch (this.f2036k) {
            case 8:
                return (String) this.f2037l;
            default:
                return super.toString();
        }
    }

    public void u(V1.p pVar, C2.K k7) {
        int i7 = 0;
        while (true) {
            V1.G[] gArr = (V1.G[]) this.f2038m;
            if (i7 >= gArr.length) {
                return;
            }
            k7.a();
            k7.b();
            V1.G gM = pVar.m(k7.f688d, 3);
            C2393o c2393o = (C2393o) ((List) this.f2037l).get(i7);
            String str = c2393o.f18112n;
            AbstractC0015b.b("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            C2392n c2392n = new C2392n();
            k7.b();
            c2392n.a = k7.f689e;
            c2392n.f18073l = y1.D.m("video/mp2t");
            c2392n.f18074m = y1.D.m(str);
            c2392n.f18066e = c2393o.f18103e;
            c2392n.f18065d = c2393o.f18102d;
            c2392n.f18060H = c2393o.I;
            c2392n.f18077p = c2393o.f18115q;
            A6.b.r(c2392n, gM);
            gArr[i7] = gM;
            i7++;
        }
    }

    public void v(int i7) {
        int[] iArr = (int[]) this.f2037l;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i7, 10) + 1];
            this.f2037l = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i7 >= iArr.length) {
            int length = iArr.length;
            while (length <= i7) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f2037l = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f2037l;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public View w(int i7, int i8, int i9, int i10) {
        View viewT;
        K2.F f5 = (K2.F) this.f2037l;
        int iD = f5.d();
        int iC = f5.c();
        int i11 = i8 > i7 ? 1 : -1;
        View view = null;
        while (i7 != i8) {
            switch (f5.a) {
                case 0:
                    viewT = f5.f4467b.t(i7);
                    break;
                default:
                    viewT = f5.f4467b.t(i7);
                    break;
            }
            int iB = f5.b(viewT);
            int iA = f5.a(viewT);
            e0 e0Var = (e0) this.f2038m;
            e0Var.f4585b = iD;
            e0Var.f4586c = iC;
            e0Var.f4587d = iB;
            e0Var.f4588e = iA;
            if (i9 != 0) {
                e0Var.a = i9;
                if (e0Var.a()) {
                    return viewT;
                }
            }
            if (i10 != 0) {
                e0Var.a = i10;
                if (e0Var.a()) {
                    view = viewT;
                }
            }
            i7 += i11;
        }
        return view;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    public InputMethodManager x() {
        return (InputMethodManager) this.f2038m.getValue();
    }

    public L2.d y() {
        L2.d dVar;
        M2.a aVar = (M2.a) this.f2037l;
        synchronized (((A.e) aVar.f6545f)) {
            Iterator it = ((LinkedHashMap) aVar.f6546g).entrySet().iterator();
            do {
                dVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                L2.d dVar2 = (L2.d) entry.getValue();
                if (kotlin.jvm.internal.l.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    dVar = dVar2;
                }
            } while (dVar == null);
        }
        return dVar;
    }

    public synchronized Map z() {
        try {
            if (((Map) this.f2038m) == null) {
                this.f2038m = Collections.unmodifiableMap(new HashMap((HashMap) this.f2037l));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.f2038m;
    }

    public /* synthetic */ w(int i7, Object obj, Object obj2) {
        this.f2036k = i7;
        this.f2037l = obj;
        this.f2038m = obj2;
    }

    public /* synthetic */ w(int i7, boolean z7) {
        this.f2036k = i7;
    }

    public /* synthetic */ w(InterfaceC0111e interfaceC0111e, InterfaceC0114h interfaceC0114h, int i7) {
        this.f2036k = i7;
        this.f2038m = interfaceC0111e;
        this.f2037l = interfaceC0114h;
    }

    public w(kotlin.jvm.internal.o oVar, C1.i iVar) {
        this.f2036k = 14;
        this.f2037l = oVar;
        this.f2038m = iVar;
        if (iVar.f580b != 1 || iVar.f581c != 1) {
            throw new IllegalArgumentException(A6.b.g("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", iVar, " was passed").toString());
        }
    }

    public w(List list) {
        this.f2036k = 6;
        this.f2037l = list;
        this.f2038m = new V1.G[list.size()];
    }

    public w(File file) {
        this.f2036k = 2;
        this.f2037l = file;
        this.f2038m = new File(file.getPath() + ".bak");
    }

    public w(int i7) {
        this.f2036k = i7;
        switch (i7) {
            case 13:
                this.f2037l = new HashMap();
                break;
            case 23:
                this.f2037l = new LinkedHashMap();
                this.f2038m = new LinkedHashMap();
                break;
            case 24:
                this.f2037l = new SparseIntArray();
                this.f2038m = new SparseIntArray();
                break;
            case 27:
                this.f2037l = new C1477G(0);
                this.f2038m = new C1492m((Object) null);
                break;
            default:
                this.f2037l = new B1.B();
                this.f2038m = new B2.b();
                break;
        }
    }

    public w(View view) {
        this.f2036k = 0;
        this.f2037l = view;
        this.f2038m = z1.c.B(O3.j.f7526l, new B.e(4, this));
    }

    public w(H h7) {
        this.f2036k = 4;
        this.f2037l = h7;
        this.f2038m = new B1.B();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w(Context context) {
        this(context, new E1.m());
        this.f2036k = 12;
    }

    public w(Context context, E1.m mVar) {
        this.f2036k = 12;
        this.f2037l = context.getApplicationContext();
        mVar.getClass();
        this.f2038m = mVar;
    }

    public w(Map map) {
        this.f2036k = 19;
        this.f2038m = map;
        this.f2037l = new C1523l("Java nullability annotation states").c(new A4.j(3, this));
    }

    public w(K2.F f5) {
        this.f2036k = 26;
        this.f2037l = f5;
        e0 e0Var = new e0();
        e0Var.a = 0;
        this.f2038m = e0Var;
    }

    public w(MediaCodec.CryptoInfo cryptoInfo) {
        this.f2036k = 16;
        this.f2037l = cryptoInfo;
        this.f2038m = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public w(String str) {
        this.f2036k = 8;
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
        this.f2037l = str;
        this.f2038m = new ArrayList(0);
        F4.k.a.getClass();
        List listA = F4.j.a();
        new ArrayList();
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((F4.k) it.next()).getClass();
        }
    }

    public w(I i7) {
        this.f2036k = 5;
        this.f2038m = i7;
        this.f2037l = new B1.A(new byte[4], 4);
    }

    public w(String str, String str2) {
        this.f2036k = 1;
        kotlin.jvm.internal.l.f("error", str);
        this.f2037l = str;
        this.f2038m = str2;
    }

    @Override // C2.E
    public void c(H h7, V1.p pVar, C2.K k7) {
    }
}
