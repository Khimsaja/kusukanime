package O;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: O.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0485c0 extends Y.w implements Parcelable, Y.p, Z, R0 {
    public static final Parcelable.Creator<C0485c0> CREATOR = new C0483b0(0);

    /* renamed from: l, reason: collision with root package name */
    public E0 f7057l;

    public C0485c0(float f5) {
        E0 e02 = new E0(f5);
        if (Y.o.a.s() != null) {
            E0 e03 = new E0(f5);
            e03.a = 1;
            e02.f10036b = e03;
        }
        this.f7057l = e02;
    }

    @Override // Y.v
    public final Y.x a() {
        return this.f7057l;
    }

    @Override // Y.p
    public final I0 c() {
        return T.f7049p;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float f() {
        return ((E0) Y.o.t(this.f7057l, this)).f6993c;
    }

    public final void g(float f5) {
        Y.h hVarK;
        E0 e02 = (E0) Y.o.i(this.f7057l);
        if (e02.f6993c == f5) {
            return;
        }
        E0 e03 = this.f7057l;
        synchronized (Y.o.f10002b) {
            hVarK = Y.o.k();
            ((E0) Y.o.o(e03, this, hVarK, e02)).f6993c = f5;
        }
        Y.o.n(hVarK, this);
    }

    @Override // O.R0
    public Object getValue() {
        return Float.valueOf(f());
    }

    @Override // Y.v
    public final Y.x h(Y.x xVar, Y.x xVar2, Y.x xVar3) {
        if (((E0) xVar2).f6993c == ((E0) xVar3).f6993c) {
            return xVar2;
        }
        return null;
    }

    @Override // Y.v
    public final void j(Y.x xVar) {
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord", xVar);
        this.f7057l = (E0) xVar;
    }

    @Override // O.Z
    public void setValue(Object obj) {
        g(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((E0) Y.o.i(this.f7057l)).f6993c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeFloat(f());
    }
}
