package O;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: O.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0489e0 extends Y.w implements Parcelable, Y.p, Z, R0 {
    public static final Parcelable.Creator<C0489e0> CREATOR = new C0483b0(2);

    /* renamed from: l, reason: collision with root package name */
    public G0 f7066l;

    public C0489e0(long j7) {
        G0 g02 = new G0(j7);
        if (Y.o.a.s() != null) {
            G0 g03 = new G0(j7);
            g03.a = 1;
            g02.f10036b = g03;
        }
        this.f7066l = g02;
    }

    @Override // Y.v
    public final Y.x a() {
        return this.f7066l;
    }

    @Override // Y.p
    public final I0 c() {
        return T.f7049p;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void f(long j7) {
        Y.h hVarK;
        G0 g02 = (G0) Y.o.i(this.f7066l);
        if (g02.f6997c != j7) {
            G0 g03 = this.f7066l;
            synchronized (Y.o.f10002b) {
                hVarK = Y.o.k();
                ((G0) Y.o.o(g03, this, hVarK, g02)).f6997c = j7;
            }
            Y.o.n(hVarK, this);
        }
    }

    @Override // O.R0
    public Object getValue() {
        return Long.valueOf(((G0) Y.o.t(this.f7066l, this)).f6997c);
    }

    @Override // Y.v
    public final Y.x h(Y.x xVar, Y.x xVar2, Y.x xVar3) {
        if (((G0) xVar2).f6997c == ((G0) xVar3).f6997c) {
            return xVar2;
        }
        return null;
    }

    @Override // Y.v
    public final void j(Y.x xVar) {
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord", xVar);
        this.f7066l = (G0) xVar;
    }

    @Override // O.Z
    public void setValue(Object obj) {
        f(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((G0) Y.o.i(this.f7066l)).f6997c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(((G0) Y.o.t(this.f7066l, this)).f6997c);
    }
}
