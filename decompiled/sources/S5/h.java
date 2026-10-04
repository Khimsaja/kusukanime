package S5;

import b1.AbstractC0703b;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class h implements n {

    /* renamed from: k, reason: collision with root package name */
    public final f f8796k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8797l;

    /* renamed from: m, reason: collision with root package name */
    public final a f8798m;

    public h(f fVar) {
        kotlin.jvm.internal.l.f("source", fVar);
        this.f8796k = fVar;
        this.f8798m = new a();
    }

    @Override // S5.n
    public final long B(e eVar) {
        a aVar;
        kotlin.jvm.internal.l.f("sink", eVar);
        long j7 = 0;
        while (true) {
            f fVar = this.f8796k;
            aVar = this.f8798m;
            if (fVar.readAtMostTo(aVar, 8192L) == -1) {
                break;
            }
            long jB = aVar.b();
            if (jB > 0) {
                j7 += jB;
                eVar.write(aVar, jB);
            }
        }
        long j8 = aVar.f8784m;
        if (j8 <= 0) {
            return j7;
        }
        long j9 = j7 + j8;
        eVar.write(aVar, j8);
        return j9;
    }

    @Override // S5.n
    public final int C(byte[] bArr, int i7, int i8) {
        kotlin.jvm.internal.l.f("sink", bArr);
        p.a(bArr.length, i7, i8);
        a aVar = this.f8798m;
        if (aVar.f8784m == 0 && this.f8796k.readAtMostTo(aVar, 8192L) == -1) {
            return -1;
        }
        return aVar.C(bArr, i7, ((int) Math.min(i8 - i7, aVar.f8784m)) + i7);
    }

    @Override // S5.n
    public final h N() {
        if (this.f8797l) {
            throw new IllegalStateException("Source is closed.");
        }
        return new h(new d(this));
    }

    @Override // S5.n
    public final void Q(long j7) throws EOFException {
        if (c(j7)) {
            return;
        }
        throw new EOFException("Source doesn't contain required number of bytes (" + j7 + ").");
    }

    @Override // S5.n, S5.l
    public final a a() {
        return this.f8798m;
    }

    @Override // S5.n
    public final boolean c(long j7) {
        a aVar;
        if (this.f8797l) {
            throw new IllegalStateException("Source is closed.");
        }
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC0703b.h("byteCount: ", j7).toString());
        }
        do {
            aVar = this.f8798m;
            if (aVar.f8784m >= j7) {
                return true;
            }
        } while (this.f8796k.readAtMostTo(aVar, 8192L) != -1);
        return false;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.f8797l) {
            return;
        }
        this.f8797l = true;
        this.f8796k.close();
        a aVar = this.f8798m;
        aVar.n(aVar.f8784m);
    }

    @Override // S5.f
    public final long readAtMostTo(a aVar, long j7) {
        kotlin.jvm.internal.l.f("sink", aVar);
        if (this.f8797l) {
            throw new IllegalStateException("Source is closed.");
        }
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC0703b.h("byteCount: ", j7).toString());
        }
        a aVar2 = this.f8798m;
        if (aVar2.f8784m == 0 && this.f8796k.readAtMostTo(aVar2, 8192L) == -1) {
            return -1L;
        }
        return aVar2.readAtMostTo(aVar, Math.min(j7, aVar2.f8784m));
    }

    @Override // S5.n
    public final byte readByte() throws EOFException {
        Q(1L);
        return this.f8798m.readByte();
    }

    @Override // S5.n
    public final int readInt() throws EOFException {
        Q(4L);
        return this.f8798m.readInt();
    }

    @Override // S5.n
    public final long readLong() throws EOFException {
        Q(8L);
        return this.f8798m.readLong();
    }

    @Override // S5.n
    public final short readShort() throws EOFException {
        Q(2L);
        return this.f8798m.readShort();
    }

    @Override // S5.n
    public final void t(l lVar, long j7) throws EOFException {
        a aVar = this.f8798m;
        kotlin.jvm.internal.l.f("sink", lVar);
        try {
            Q(j7);
            aVar.t(lVar, j7);
        } catch (EOFException e7) {
            lVar.write(aVar, aVar.f8784m);
            throw e7;
        }
    }

    public final String toString() {
        return "buffered(" + this.f8796k + ')';
    }

    @Override // S5.n
    public final boolean z() {
        if (this.f8797l) {
            throw new IllegalStateException("Source is closed.");
        }
        a aVar = this.f8798m;
        return aVar.z() && this.f8796k.readAtMostTo(aVar, 8192L) == -1;
    }
}
