package F5;

import B1.B;
import M1.x;
import android.graphics.Bitmap;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import b3.C0710b;
import b3.C0711c;
import b3.C0716h;
import b3.InterfaceC0718j;
import b6.L;
import io.ktor.http.ContentType;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m.AbstractC1489j;
import m.C1496q;
import p.AbstractC1714A;
import p.C1725L;
import w6.C2221f;

/* loaded from: classes.dex */
public final class o implements x, InterfaceC0718j, b6.o {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2540k;

    /* renamed from: l, reason: collision with root package name */
    public int f2541l;

    /* renamed from: m, reason: collision with root package name */
    public Object f2542m;

    public /* synthetic */ o(char c2, int i7) {
        this.f2540k = i7;
    }

    @Override // M1.x
    public MediaCodecInfo a(int i7) {
        if (((MediaCodecInfo[]) this.f2542m) == null) {
            this.f2542m = new MediaCodecList(this.f2541l).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f2542m)[i7];
    }

    public Object b() {
        int i7 = this.f2541l;
        if (i7 <= 0) {
            return null;
        }
        int i8 = i7 - 1;
        Object[] objArr = (Object[]) this.f2542m;
        Object obj = objArr[i8];
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool", obj);
        objArr[i8] = null;
        this.f2541l--;
        return obj;
    }

    @Override // b6.o
    public void c(char c2) {
        o(this.f2541l, 1);
        char[] cArr = (char[]) this.f2542m;
        int i7 = this.f2541l;
        this.f2541l = i7 + 1;
        cArr[i7] = c2;
    }

    public C1725L d(Float f5, int i7) {
        C1725L c1725l = new C1725L(f5, AbstractC1714A.f13835c);
        ((C1496q) this.f2542m).h(i7, c1725l);
        return c1725l;
    }

    @Override // M1.x
    public boolean e(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // b3.InterfaceC0718j
    public synchronized void f(int i7) {
        if (i7 >= 10 && i7 != 20) {
            m();
        }
    }

    @Override // b3.InterfaceC0718j
    public synchronized C0711c g(C0710b c0710b) {
        try {
            ArrayList arrayList = (ArrayList) ((LinkedHashMap) this.f2542m).get(c0710b);
            C0711c c0711c = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    break;
                }
                C0716h c0716h = (C0716h) arrayList.get(i7);
                Bitmap bitmap = (Bitmap) c0716h.f10943b.get();
                C0711c c0711c2 = bitmap != null ? new C0711c(bitmap, c0716h.f10944c) : null;
                if (c0711c2 != null) {
                    c0711c = c0711c2;
                    break;
                }
                i7++;
            }
            int i8 = this.f2541l;
            this.f2541l = i8 + 1;
            if (i8 >= 10) {
                m();
            }
            return c0711c;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // b6.o
    public void h(long j7) {
        p(String.valueOf(j7));
    }

    @Override // M1.x
    public int i() {
        if (((MediaCodecInfo[]) this.f2542m) == null) {
            this.f2542m = new MediaCodecList(this.f2541l).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f2542m).length;
    }

    @Override // b3.InterfaceC0718j
    public synchronized void j(C0710b c0710b, Bitmap bitmap, Map map, int i7) {
        try {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f2542m;
            Object arrayList = linkedHashMap.get(c0710b);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(c0710b, arrayList);
            }
            ArrayList arrayList2 = (ArrayList) arrayList;
            int iIdentityHashCode = System.identityHashCode(bitmap);
            C0716h c0716h = new C0716h(iIdentityHashCode, new WeakReference(bitmap), map, i7);
            int size = arrayList2.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size) {
                    arrayList2.add(c0716h);
                    break;
                }
                C0716h c0716h2 = (C0716h) arrayList2.get(i8);
                if (i7 < c0716h2.f10945d) {
                    i8++;
                } else if (c0716h2.a == iIdentityHashCode && c0716h2.f10943b.get() == bitmap) {
                    arrayList2.set(i8, c0716h);
                } else {
                    arrayList2.add(i8, c0716h);
                }
            }
            int i9 = this.f2541l;
            this.f2541l = i9 + 1;
            if (i9 >= 10) {
                m();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // M1.x
    public boolean k(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // M1.x
    public boolean l() {
        return true;
    }

    public void m() {
        WeakReference weakReference;
        this.f2541l = 0;
        Iterator it = ((LinkedHashMap) this.f2542m).values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                C0716h c0716h = (C0716h) P3.q.t0(arrayList);
                if (((c0716h == null || (weakReference = c0716h.f10943b) == null) ? null : (Bitmap) weakReference.get()) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i7 = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    int i9 = i8 - i7;
                    if (((C0716h) arrayList.get(i9)).f10943b.get() == null) {
                        arrayList.remove(i9);
                        i7++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    @Override // b6.o
    public void n(String str) {
        byte b4;
        kotlin.jvm.internal.l.f(ContentType.Text.TYPE, str);
        o(this.f2541l, str.length() + 2);
        char[] cArr = (char[]) this.f2542m;
        int i7 = this.f2541l;
        int i8 = i7 + 1;
        cArr[i7] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i8);
        int i9 = length + i8;
        int i10 = i8;
        while (i10 < i9) {
            char c2 = cArr[i10];
            byte[] bArr = L.f11001b;
            if (c2 < bArr.length && bArr[c2] != 0) {
                int length2 = str.length();
                for (int i11 = i10 - i8; i11 < length2; i11++) {
                    o(i10, 2);
                    char cCharAt = str.charAt(i11);
                    byte[] bArr2 = L.f11001b;
                    if (cCharAt >= bArr2.length || (b4 = bArr2[cCharAt]) == 0) {
                        int i12 = i10 + 1;
                        ((char[]) this.f2542m)[i10] = cCharAt;
                        i10 = i12;
                    } else {
                        if (b4 == 1) {
                            String str2 = L.a[cCharAt];
                            kotlin.jvm.internal.l.c(str2);
                            o(i10, str2.length());
                            str2.getChars(0, str2.length(), (char[]) this.f2542m, i10);
                            int length3 = str2.length() + i10;
                            this.f2541l = length3;
                            i10 = length3;
                        } else {
                            char[] cArr2 = (char[]) this.f2542m;
                            cArr2[i10] = '\\';
                            cArr2[i10 + 1] = (char) b4;
                            i10 += 2;
                            this.f2541l = i10;
                        }
                    }
                }
                o(i10, 1);
                ((char[]) this.f2542m)[i10] = '\"';
                this.f2541l = i10 + 1;
                return;
            }
            i10++;
        }
        cArr[i9] = '\"';
        this.f2541l = i9 + 1;
    }

    public void o(int i7, int i8) {
        int i9 = i8 + i7;
        char[] cArr = (char[]) this.f2542m;
        if (cArr.length <= i9) {
            int i10 = i7 * 2;
            if (i9 < i10) {
                i9 = i10;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i9);
            kotlin.jvm.internal.l.e("copyOf(...)", cArrCopyOf);
            this.f2542m = cArrCopyOf;
        }
    }

    @Override // b6.o
    public void p(String str) {
        kotlin.jvm.internal.l.f(ContentType.Text.TYPE, str);
        int length = str.length();
        if (length == 0) {
            return;
        }
        o(this.f2541l, length);
        str.getChars(0, str.length(), (char[]) this.f2542m, this.f2541l);
        this.f2541l += length;
    }

    public boolean q() {
        return this.f2541l < ((ArrayList) this.f2542m).size();
    }

    public void r(int i7, C2221f c2221f) {
        while (true) {
            int i8 = i7 >> 1;
            if (i8 == 0) {
                break;
            }
            C2221f c2221f2 = ((C2221f[]) this.f2542m)[i8];
            kotlin.jvm.internal.l.c(c2221f2);
            if (kotlin.jvm.internal.l.h(0L, c2221f.f17128c - c2221f2.f17128c) <= 0) {
                break;
            }
            c2221f2.f17146f = i7;
            ((C2221f[]) this.f2542m)[i7] = c2221f2;
            i7 = i8;
        }
        ((C2221f[]) this.f2542m)[i7] = c2221f;
        c2221f.f17146f = i7;
    }

    public long s(V1.k kVar) {
        B b4 = (B) this.f2542m;
        int i7 = 0;
        kVar.h(b4.a, 0, 1, false);
        int i8 = b4.a[0] & 255;
        if (i8 == 0) {
            return Long.MIN_VALUE;
        }
        int i9 = 128;
        int i10 = 0;
        while ((i8 & i9) == 0) {
            i9 >>= 1;
            i10++;
        }
        int i11 = i8 & (~i9);
        kVar.h(b4.a, 1, i10, false);
        while (i7 < i10) {
            i7++;
            i11 = (b4.a[i7] & 255) + (i11 << 8);
        }
        this.f2541l = i10 + 1 + this.f2541l;
        return i11;
    }

    public void t(Object obj) {
        kotlin.jvm.internal.l.f("instance", obj);
        int i7 = this.f2541l;
        int i8 = 0;
        while (true) {
            Object[] objArr = (Object[]) this.f2542m;
            if (i8 >= i7) {
                int i9 = this.f2541l;
                if (i9 < objArr.length) {
                    objArr[i9] = obj;
                    this.f2541l = i9 + 1;
                    return;
                }
                return;
            }
            if (objArr[i8] == obj) {
                throw new IllegalStateException("Already in the pool!");
            }
            i8++;
        }
    }

    public String toString() {
        switch (this.f2540k) {
            case 5:
                return new String((char[]) this.f2542m, 0, this.f2541l);
            default:
                return super.toString();
        }
    }

    public void u(C2221f c2221f) {
        C2221f c2221f2;
        kotlin.jvm.internal.l.f("node", c2221f);
        int i7 = c2221f.f17146f;
        if (i7 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i8 = this.f2541l;
        C2221f c2221f3 = ((C2221f[]) this.f2542m)[i8];
        kotlin.jvm.internal.l.c(c2221f3);
        c2221f.f17146f = -1;
        ((C2221f[]) this.f2542m)[i8] = null;
        this.f2541l = i8 - 1;
        if (c2221f == c2221f3) {
            return;
        }
        int iH = kotlin.jvm.internal.l.h(0L, c2221f3.f17128c - c2221f.f17128c);
        if (iH == 0) {
            ((C2221f[]) this.f2542m)[i7] = c2221f3;
            c2221f3.f17146f = i7;
            return;
        }
        if (iH >= 0) {
            r(i7, c2221f3);
            return;
        }
        while (true) {
            int i9 = i7 << 1;
            int i10 = i9 + 1;
            int i11 = this.f2541l;
            if (i10 > i11) {
                if (i9 > i11) {
                    break;
                }
                c2221f2 = ((C2221f[]) this.f2542m)[i9];
                kotlin.jvm.internal.l.c(c2221f2);
            } else {
                c2221f2 = ((C2221f[]) this.f2542m)[i9];
                kotlin.jvm.internal.l.c(c2221f2);
                C2221f c2221f4 = ((C2221f[]) this.f2542m)[i10];
                kotlin.jvm.internal.l.c(c2221f4);
                if (kotlin.jvm.internal.l.h(0L, c2221f4.f17128c - c2221f2.f17128c) >= 0) {
                    c2221f2 = c2221f4;
                }
            }
            if (kotlin.jvm.internal.l.h(0L, c2221f2.f17128c - c2221f3.f17128c) <= 0) {
                break;
            }
            int i12 = c2221f2.f17146f;
            c2221f2.f17146f = i7;
            ((C2221f[]) this.f2542m)[i7] = c2221f2;
            i7 = i12;
        }
        ((C2221f[]) this.f2542m)[i7] = c2221f3;
        c2221f3.f17146f = i7;
    }

    public /* synthetic */ o(int i7, int i8, Object obj) {
        this.f2540k = i8;
        this.f2542m = obj;
        this.f2541l = i7;
    }

    public o(int i7, List list) {
        this.f2540k = 12;
        this.f2541l = i7;
        this.f2542m = list;
    }

    public o(int i7, byte b4) {
        this.f2540k = i7;
        switch (i7) {
            case 6:
                this.f2541l = 1;
                this.f2542m = Collections.singletonList(null);
                break;
            case 7:
            case 8:
            default:
                this.f2542m = new LinkedHashMap();
                break;
            case 9:
                this.f2542m = new B(8);
                break;
            case 10:
                this.f2541l = 300;
                C1496q c1496q = AbstractC1489j.a;
                this.f2542m = new C1496q();
                break;
        }
    }

    public o(int i7) {
        this.f2540k = 7;
        if (i7 > 0) {
            this.f2542m = new Object[i7];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public o(p pVar, int i7) {
        this.f2540k = 0;
        kotlin.jvm.internal.l.f("node", pVar);
        this.f2542m = pVar;
        this.f2541l = i7;
    }

    public o(int i7, ArrayList arrayList) {
        this.f2540k = i7;
        switch (i7) {
            case 8:
                this.f2542m = arrayList;
                break;
            default:
                this.f2541l = 0;
                this.f2542m = arrayList;
                break;
        }
    }

    public o(boolean z7, boolean z8, boolean z9) {
        this.f2540k = 1;
        this.f2541l = (z7 || z8 || z9) ? 1 : 0;
    }
}
