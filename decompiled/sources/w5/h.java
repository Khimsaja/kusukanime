package w5;

import P3.AbstractC0568i;
import P3.F;
import P3.m;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class h extends AbstractC0568i {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f17106m = 0;

    /* renamed from: k, reason: collision with root package name */
    public Object f17107k;

    /* renamed from: l, reason: collision with root package name */
    public int f17108l;

    @Override // P3.AbstractC0568i
    public final int a() {
        return this.f17108l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Object[] objArr;
        int i7 = this.f17108l;
        if (i7 == 0) {
            this.f17107k = obj;
        } else if (i7 == 1) {
            if (l.a(this.f17107k, obj)) {
                return false;
            }
            this.f17107k = new Object[]{this.f17107k, obj};
        } else if (i7 < 5) {
            Object obj2 = this.f17107k;
            l.d("null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>", obj2);
            Object[] objArr2 = (Object[]) obj2;
            if (m.R(obj, objArr2)) {
                return false;
            }
            int i8 = this.f17108l;
            if (i8 == 4) {
                Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
                l.f("elements", objArrCopyOf);
                LinkedHashSet linkedHashSet = new LinkedHashSet(F.I(objArrCopyOf.length));
                m.t0(objArrCopyOf, linkedHashSet);
                linkedHashSet.add(obj);
                objArr = linkedHashSet;
            } else {
                Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, i8 + 1);
                l.e("copyOf(...)", objArrCopyOf2);
                objArrCopyOf2[objArrCopyOf2.length - 1] = obj;
                objArr = objArrCopyOf2;
            }
            this.f17107k = objArr;
        } else {
            Object obj3 = this.f17107k;
            l.d("null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>", obj3);
            if (!B.d(obj3).add(obj)) {
                return false;
            }
        }
        this.f17108l++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f17107k = null;
        this.f17108l = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (a() == 0) {
            return false;
        }
        if (a() == 1) {
            return l.a(this.f17107k, obj);
        }
        if (a() < 5) {
            Object obj2 = this.f17107k;
            l.d("null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>", obj2);
            return m.R(obj, (Object[]) obj2);
        }
        Object obj3 = this.f17107k;
        l.d("null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>", obj3);
        return ((Set) obj3).contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i7 = this.f17108l;
        if (i7 == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (i7 == 1) {
            return new g(0, this.f17107k);
        }
        if (i7 < 5) {
            Object obj = this.f17107k;
            l.d("null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>", obj);
            return new F5.i((Object[]) obj);
        }
        Object obj2 = this.f17107k;
        l.d("null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>", obj2);
        return B.d(obj2).iterator();
    }
}
