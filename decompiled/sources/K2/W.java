package K2;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import i1.AbstractC1067u;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class W {

    /* renamed from: s, reason: collision with root package name */
    public static final List f4519s = Collections.EMPTY_LIST;
    public final View a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f4520b;

    /* renamed from: i, reason: collision with root package name */
    public int f4527i;

    /* renamed from: q, reason: collision with root package name */
    public RecyclerView f4535q;

    /* renamed from: r, reason: collision with root package name */
    public A f4536r;

    /* renamed from: c, reason: collision with root package name */
    public int f4521c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f4522d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f4523e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f4524f = -1;

    /* renamed from: g, reason: collision with root package name */
    public W f4525g = null;

    /* renamed from: h, reason: collision with root package name */
    public W f4526h = null;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f4528j = null;

    /* renamed from: k, reason: collision with root package name */
    public final List f4529k = null;

    /* renamed from: l, reason: collision with root package name */
    public int f4530l = 0;

    /* renamed from: m, reason: collision with root package name */
    public N f4531m = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4532n = false;

    /* renamed from: o, reason: collision with root package name */
    public int f4533o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f4534p = -1;

    public W(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.a = view;
    }

    public final void a(int i7) {
        this.f4527i = i7 | this.f4527i;
    }

    public final int b() {
        int i7 = this.f4524f;
        return i7 == -1 ? this.f4521c : i7;
    }

    public final List c() {
        ArrayList arrayList;
        return ((this.f4527i & 1024) != 0 || (arrayList = this.f4528j) == null || arrayList.size() == 0) ? f4519s : this.f4529k;
    }

    public final boolean d() {
        return (this.f4527i & 1) != 0;
    }

    public final boolean e() {
        return (this.f4527i & 4) != 0;
    }

    public final boolean f() {
        if ((this.f4527i & 16) != 0) {
            return false;
        }
        Field field = AbstractC1067u.a;
        return !this.a.hasTransientState();
    }

    public final boolean g() {
        return (this.f4527i & 8) != 0;
    }

    public final boolean h() {
        return this.f4531m != null;
    }

    public final boolean i() {
        return (this.f4527i & 256) != 0;
    }

    public final boolean j() {
        return (this.f4527i & 2) != 0;
    }

    public final void k(int i7, boolean z7) {
        if (this.f4522d == -1) {
            this.f4522d = this.f4521c;
        }
        if (this.f4524f == -1) {
            this.f4524f = this.f4521c;
        }
        if (z7) {
            this.f4524f += i7;
        }
        this.f4521c += i7;
        View view = this.a;
        if (view.getLayoutParams() != null) {
            ((I) view.getLayoutParams()).f4485c = true;
        }
    }

    public final void l() {
        this.f4527i = 0;
        this.f4521c = -1;
        this.f4522d = -1;
        this.f4524f = -1;
        this.f4530l = 0;
        this.f4525g = null;
        this.f4526h = null;
        ArrayList arrayList = this.f4528j;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f4527i &= -1025;
        this.f4533o = 0;
        this.f4534p = -1;
        RecyclerView.g(this);
    }

    public final void m(boolean z7) {
        int i7 = this.f4530l;
        int i8 = z7 ? i7 - 1 : i7 + 1;
        this.f4530l = i8;
        if (i8 < 0) {
            this.f4530l = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z7 && i8 == 1) {
            this.f4527i |= 16;
        } else if (z7 && i8 == 0) {
            this.f4527i &= -17;
        }
    }

    public final boolean n() {
        return (this.f4527i & 128) != 0;
    }

    public final boolean o() {
        return (this.f4527i & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f4521c + " id=-1, oldPos=" + this.f4522d + ", pLpos:" + this.f4524f);
        if (h()) {
            sb.append(" scrap ");
            sb.append(this.f4532n ? "[changeScrap]" : "[attachedScrap]");
        }
        if (e()) {
            sb.append(" invalid");
        }
        if (!d()) {
            sb.append(" unbound");
        }
        if ((this.f4527i & 2) != 0) {
            sb.append(" update");
        }
        if (g()) {
            sb.append(" removed");
        }
        if (n()) {
            sb.append(" ignored");
        }
        if (i()) {
            sb.append(" tmpDetached");
        }
        if (!f()) {
            sb.append(" not recyclable(" + this.f4530l + ")");
        }
        if ((this.f4527i & 512) != 0 || e()) {
            sb.append(" undefined adapter position");
        }
        if (this.a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
