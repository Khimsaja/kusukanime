package z1;

import B1.AbstractC0015b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public final class j implements g {

    /* renamed from: b, reason: collision with root package name */
    public int f18992b;

    /* renamed from: c, reason: collision with root package name */
    public float f18993c;

    /* renamed from: d, reason: collision with root package name */
    public float f18994d;

    /* renamed from: e, reason: collision with root package name */
    public e f18995e;

    /* renamed from: f, reason: collision with root package name */
    public e f18996f;

    /* renamed from: g, reason: collision with root package name */
    public e f18997g;

    /* renamed from: h, reason: collision with root package name */
    public e f18998h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f18999i;

    /* renamed from: j, reason: collision with root package name */
    public i f19000j;

    /* renamed from: k, reason: collision with root package name */
    public ByteBuffer f19001k;

    /* renamed from: l, reason: collision with root package name */
    public ShortBuffer f19002l;

    /* renamed from: m, reason: collision with root package name */
    public ByteBuffer f19003m;

    /* renamed from: n, reason: collision with root package name */
    public long f19004n;

    /* renamed from: o, reason: collision with root package name */
    public long f19005o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f19006p;

    @Override // z1.g
    public final ByteBuffer a() {
        i iVar = this.f19000j;
        if (iVar != null) {
            AbstractC0015b.h(iVar.f18981m >= 0);
            int i7 = iVar.f18981m;
            int i8 = iVar.f18970b;
            int i9 = i7 * i8 * 2;
            if (i9 > 0) {
                if (this.f19001k.capacity() < i9) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i9).order(ByteOrder.nativeOrder());
                    this.f19001k = byteBufferOrder;
                    this.f19002l = byteBufferOrder.asShortBuffer();
                } else {
                    this.f19001k.clear();
                    this.f19002l.clear();
                }
                ShortBuffer shortBuffer = this.f19002l;
                AbstractC0015b.h(iVar.f18981m >= 0);
                int iMin = Math.min(shortBuffer.remaining() / i8, iVar.f18981m);
                int i10 = iMin * i8;
                shortBuffer.put(iVar.f18980l, 0, i10);
                int i11 = iVar.f18981m - iMin;
                iVar.f18981m = i11;
                short[] sArr = iVar.f18980l;
                System.arraycopy(sArr, i10, sArr, 0, i11 * i8);
                this.f19005o += i9;
                this.f19001k.limit(i9);
                this.f19003m = this.f19001k;
            }
        }
        ByteBuffer byteBuffer = this.f19003m;
        this.f19003m = g.a;
        return byteBuffer;
    }

    @Override // z1.g
    public final boolean b() {
        if (this.f18996f.a != -1) {
            return Math.abs(this.f18993c - 1.0f) >= 1.0E-4f || Math.abs(this.f18994d - 1.0f) >= 1.0E-4f || this.f18996f.a != this.f18995e.a;
        }
        return false;
    }

    @Override // z1.g
    public final void c() {
        i iVar = this.f19000j;
        if (iVar != null) {
            int i7 = iVar.f18979k;
            float f5 = iVar.f18971c;
            float f7 = iVar.f18972d;
            double d4 = f5 / f7;
            int i8 = iVar.f18981m + ((int) (((((((i7 - r6) / d4) + iVar.f18986r) + iVar.f18991w) + iVar.f18983o) / (iVar.f18973e * f7)) + 0.5d));
            iVar.f18991w = 0.0d;
            short[] sArr = iVar.f18978j;
            int i9 = iVar.f18976h * 2;
            iVar.f18978j = iVar.c(sArr, i7, i9 + i7);
            int i10 = 0;
            while (true) {
                int i11 = iVar.f18970b;
                if (i10 >= i9 * i11) {
                    break;
                }
                iVar.f18978j[(i11 * i7) + i10] = 0;
                i10++;
            }
            iVar.f18979k = i9 + iVar.f18979k;
            iVar.f();
            if (iVar.f18981m > i8) {
                iVar.f18981m = Math.max(i8, 0);
            }
            iVar.f18979k = 0;
            iVar.f18986r = 0;
            iVar.f18983o = 0;
        }
        this.f19006p = true;
    }

    @Override // z1.g
    public final boolean d() {
        if (this.f19006p) {
            i iVar = this.f19000j;
            if (iVar != null) {
                AbstractC0015b.h(iVar.f18981m >= 0);
                if (iVar.f18981m * iVar.f18970b * 2 == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // z1.g
    public final void e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            i iVar = this.f19000j;
            iVar.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f19004n += iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i7 = iVar.f18970b;
            int i8 = iRemaining2 / i7;
            short[] sArrC = iVar.c(iVar.f18978j, iVar.f18979k, i8);
            iVar.f18978j = sArrC;
            shortBufferAsShortBuffer.get(sArrC, iVar.f18979k * i7, ((i8 * i7) * 2) / 2);
            iVar.f18979k += i8;
            iVar.f();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // z1.g
    public final e f(e eVar) throws f {
        if (eVar.f18961c != 2) {
            throw new f(eVar);
        }
        int i7 = this.f18992b;
        if (i7 == -1) {
            i7 = eVar.a;
        }
        this.f18995e = eVar;
        e eVar2 = new e(i7, eVar.f18960b, 2);
        this.f18996f = eVar2;
        this.f18999i = true;
        return eVar2;
    }

    @Override // z1.g
    public final void flush() {
        if (b()) {
            e eVar = this.f18995e;
            this.f18997g = eVar;
            e eVar2 = this.f18996f;
            this.f18998h = eVar2;
            if (this.f18999i) {
                int i7 = eVar.a;
                this.f19000j = new i(this.f18993c, this.f18994d, i7, eVar.f18960b, eVar2.a);
            } else {
                i iVar = this.f19000j;
                if (iVar != null) {
                    iVar.f18979k = 0;
                    iVar.f18981m = 0;
                    iVar.f18983o = 0;
                    iVar.f18984p = 0;
                    iVar.f18985q = 0;
                    iVar.f18986r = 0;
                    iVar.f18987s = 0;
                    iVar.f18988t = 0;
                    iVar.f18989u = 0;
                    iVar.f18990v = 0;
                    iVar.f18991w = 0.0d;
                }
            }
        }
        this.f19003m = g.a;
        this.f19004n = 0L;
        this.f19005o = 0L;
        this.f19006p = false;
    }

    @Override // z1.g
    public final void reset() {
        this.f18993c = 1.0f;
        this.f18994d = 1.0f;
        e eVar = e.f18959e;
        this.f18995e = eVar;
        this.f18996f = eVar;
        this.f18997g = eVar;
        this.f18998h = eVar;
        ByteBuffer byteBuffer = g.a;
        this.f19001k = byteBuffer;
        this.f19002l = byteBuffer.asShortBuffer();
        this.f19003m = byteBuffer;
        this.f18992b = -1;
        this.f18999i = false;
        this.f19000j = null;
        this.f19004n = 0L;
        this.f19005o = 0L;
        this.f19006p = false;
    }
}
