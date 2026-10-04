package O;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: O.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0493g0 extends Y.w implements Parcelable, Y.p {
    public static final Parcelable.Creator<C0493g0> CREATOR = new C0491f0();

    /* renamed from: l, reason: collision with root package name */
    public final I0 f7074l;

    /* renamed from: m, reason: collision with root package name */
    public H0 f7075m;

    public C0493g0(Object obj, I0 i02) {
        this.f7074l = i02;
        H0 h02 = new H0(obj);
        if (Y.o.a.s() != null) {
            H0 h03 = new H0(obj);
            h03.a = 1;
            h02.f10036b = h03;
        }
        this.f7075m = h02;
    }

    @Override // Y.v
    public final Y.x a() {
        return this.f7075m;
    }

    @Override // Y.p
    public final I0 c() {
        return this.f7074l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // O.R0
    public final Object getValue() {
        return ((H0) Y.o.t(this.f7075m, this)).f6998c;
    }

    @Override // Y.v
    public final Y.x h(Y.x xVar, Y.x xVar2, Y.x xVar3) {
        if (this.f7074l.a(((H0) xVar2).f6998c, ((H0) xVar3).f6998c)) {
            return xVar2;
        }
        return null;
    }

    @Override // Y.v
    public final void j(Y.x xVar) {
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>", xVar);
        this.f7075m = (H0) xVar;
    }

    @Override // O.Z
    public final void setValue(Object obj) {
        Y.h hVarK;
        H0 h02 = (H0) Y.o.i(this.f7075m);
        if (this.f7074l.a(h02.f6998c, obj)) {
            return;
        }
        H0 h03 = this.f7075m;
        synchronized (Y.o.f10002b) {
            hVarK = Y.o.k();
            ((H0) Y.o.o(h03, this, hVarK, h02)).f6998c = obj;
        }
        Y.o.n(hVarK, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((H0) Y.o.i(this.f7075m)).f6998c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8;
        parcel.writeValue(getValue());
        T t7 = T.f7046m;
        I0 i02 = this.f7074l;
        if (kotlin.jvm.internal.l.a(i02, t7)) {
            i8 = 0;
        } else if (kotlin.jvm.internal.l.a(i02, T.f7049p)) {
            i8 = 1;
        } else {
            if (!kotlin.jvm.internal.l.a(i02, T.f7047n)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i8 = 2;
        }
        parcel.writeInt(i8);
    }
}
