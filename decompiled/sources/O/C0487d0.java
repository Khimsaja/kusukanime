package O;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: O.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0487d0 extends Y.w implements Parcelable, Y.p, Z, R0 {
    public static final Parcelable.Creator<C0487d0> CREATOR = new C0483b0(1);

    /* renamed from: l, reason: collision with root package name */
    public F0 f7065l;

    public C0487d0(int i7) {
        F0 f02 = new F0(i7);
        if (Y.o.a.s() != null) {
            F0 f03 = new F0(i7);
            f03.a = 1;
            f02.f10036b = f03;
        }
        this.f7065l = f02;
    }

    @Override // Y.v
    public final Y.x a() {
        return this.f7065l;
    }

    @Override // Y.p
    public final I0 c() {
        return T.f7049p;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int f() {
        return ((F0) Y.o.t(this.f7065l, this)).f6996c;
    }

    public final void g(int i7) {
        Y.h hVarK;
        F0 f02 = (F0) Y.o.i(this.f7065l);
        if (f02.f6996c != i7) {
            F0 f03 = this.f7065l;
            synchronized (Y.o.f10002b) {
                hVarK = Y.o.k();
                ((F0) Y.o.o(f03, this, hVarK, f02)).f6996c = i7;
            }
            Y.o.n(hVarK, this);
        }
    }

    @Override // O.R0
    public Object getValue() {
        return Integer.valueOf(f());
    }

    @Override // Y.v
    public final Y.x h(Y.x xVar, Y.x xVar2, Y.x xVar3) {
        if (((F0) xVar2).f6996c == ((F0) xVar3).f6996c) {
            return xVar2;
        }
        return null;
    }

    @Override // Y.v
    public final void j(Y.x xVar) {
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord", xVar);
        this.f7065l = (F0) xVar;
    }

    @Override // O.Z
    public void setValue(Object obj) {
        g(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((F0) Y.o.i(this.f7065l)).f6996c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(f());
    }
}
