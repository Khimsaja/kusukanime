package x4;

import com.kusukanime.BuildConfig;
import io.ktor.http.ContentDisposition;
import io.ktor.http.LinkHeader;
import io.ktor.util.GzipHeaderFlags;
import io.ktor.util.collections.ConcurrentMapKt;
import java.util.LinkedHashMap;
import java.util.List;
import n5.AbstractC1586x;
import u4.EnumC2117x;
import u4.InterfaceC2099e;
import u4.InterfaceC2105k;
import u4.InterfaceC2112s;

/* renamed from: x4.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2293t implements u4.r {
    public n5.T a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC2105k f17458b;

    /* renamed from: c, reason: collision with root package name */
    public EnumC2117x f17459c;

    /* renamed from: d, reason: collision with root package name */
    public H4.o f17460d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC2112s f17461e;

    /* renamed from: f, reason: collision with root package name */
    public int f17462f;

    /* renamed from: g, reason: collision with root package name */
    public List f17463g;

    /* renamed from: h, reason: collision with root package name */
    public final List f17464h;

    /* renamed from: i, reason: collision with root package name */
    public C2295v f17465i;

    /* renamed from: j, reason: collision with root package name */
    public C2295v f17466j;

    /* renamed from: k, reason: collision with root package name */
    public AbstractC1586x f17467k;

    /* renamed from: l, reason: collision with root package name */
    public W4.e f17468l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f17469m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f17470n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f17471o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f17472p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f17473q;

    /* renamed from: r, reason: collision with root package name */
    public P3.y f17474r;

    /* renamed from: s, reason: collision with root package name */
    public v4.h f17475s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f17476t;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashMap f17477u;

    /* renamed from: v, reason: collision with root package name */
    public Boolean f17478v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f17479w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AbstractC2294u f17480x;

    public C2293t(AbstractC2294u abstractC2294u, n5.T t7, InterfaceC2105k interfaceC2105k, EnumC2117x enumC2117x, H4.o oVar, int i7, List list, List list2, C2295v c2295v, AbstractC1586x abstractC1586x) {
        if (t7 == null) {
            c(0);
            throw null;
        }
        if (interfaceC2105k == null) {
            c(1);
            throw null;
        }
        if (enumC2117x == null) {
            c(2);
            throw null;
        }
        if (oVar == null) {
            c(3);
            throw null;
        }
        if (i7 == 0) {
            c(4);
            throw null;
        }
        if (list == null) {
            c(5);
            throw null;
        }
        if (list2 == null) {
            c(6);
            throw null;
        }
        if (abstractC1586x == null) {
            c(7);
            throw null;
        }
        this.f17480x = abstractC2294u;
        this.f17461e = null;
        this.f17466j = abstractC2294u.f17497t;
        this.f17469m = true;
        this.f17470n = false;
        this.f17471o = false;
        this.f17472p = false;
        this.f17473q = abstractC2294u.f17483C;
        this.f17474r = null;
        this.f17475s = null;
        this.f17476t = abstractC2294u.f17484D;
        this.f17477u = new LinkedHashMap();
        this.f17478v = null;
        this.f17479w = false;
        this.a = t7;
        this.f17458b = interfaceC2105k;
        this.f17459c = enumC2117x;
        this.f17460d = oVar;
        this.f17462f = i7;
        this.f17463g = list;
        this.f17464h = list2;
        this.f17465i = c2295v;
        this.f17467k = abstractC1586x;
        this.f17468l = null;
    }

    public static /* synthetic */ void c(int i7) {
        String str;
        int i8;
        switch (i7) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case BuildConfig.VERSION_CODE /* 30 */:
            case 31:
            case ConcurrentMapKt.INITIAL_CAPACITY /* 32 */:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i7) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case BuildConfig.VERSION_CODE /* 30 */:
            case 31:
            case ConcurrentMapKt.INITIAL_CAPACITY /* 32 */:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                i8 = 2;
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                i8 = 3;
                break;
        }
        Object[] objArr = new Object[i8];
        switch (i7) {
            case 1:
                objArr[0] = "newOwner";
                break;
            case 2:
                objArr[0] = "newModality";
                break;
            case 3:
                objArr[0] = "newVisibility";
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
            case 14:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "newValueParameterDescriptors";
                break;
            case 6:
                objArr[0] = "newContextReceiverParameters";
                break;
            case 7:
                objArr[0] = "newReturnType";
                break;
            case 8:
                objArr[0] = "owner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case BuildConfig.VERSION_CODE /* 30 */:
            case 31:
            case ConcurrentMapKt.INITIAL_CAPACITY /* 32 */:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 10:
                objArr[0] = "modality";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 17:
                objArr[0] = ContentDisposition.Parameters.Name;
                break;
            case 19:
            case 21:
                objArr[0] = "parameters";
                break;
            case 23:
                objArr[0] = LinkHeader.Parameters.Type;
                break;
            case 25:
                objArr[0] = "contextReceiverParameters";
                break;
            case 35:
                objArr[0] = "additionalAnnotations";
                break;
            case 37:
            default:
                objArr[0] = "substitution";
                break;
            case 39:
                objArr[0] = "userDataKey";
                break;
        }
        switch (i7) {
            case 9:
                objArr[1] = "setOwner";
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 11:
                objArr[1] = "setModality";
                break;
            case 13:
                objArr[1] = "setVisibility";
                break;
            case 15:
                objArr[1] = "setKind";
                break;
            case 16:
                objArr[1] = "setCopyOverrides";
                break;
            case 18:
                objArr[1] = "setName";
                break;
            case 20:
                objArr[1] = "setValueParameters";
                break;
            case 22:
                objArr[1] = "setTypeParameters";
                break;
            case 24:
                objArr[1] = "setReturnType";
                break;
            case 26:
                objArr[1] = "setContextReceiverParameters";
                break;
            case 27:
                objArr[1] = "setExtensionReceiverParameter";
                break;
            case 28:
                objArr[1] = "setDispatchReceiverParameter";
                break;
            case 29:
                objArr[1] = "setOriginal";
                break;
            case BuildConfig.VERSION_CODE /* 30 */:
                objArr[1] = "setSignatureChange";
                break;
            case 31:
                objArr[1] = "setPreserveSourceElement";
                break;
            case ConcurrentMapKt.INITIAL_CAPACITY /* 32 */:
                objArr[1] = "setDropOriginalInContainingParts";
                break;
            case 33:
                objArr[1] = "setHiddenToOvercomeSignatureClash";
                break;
            case 34:
                objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                break;
            case 36:
                objArr[1] = "setAdditionalAnnotations";
                break;
            case 38:
                objArr[1] = "setSubstitution";
                break;
            case 40:
                objArr[1] = "putUserData";
                break;
            case 41:
                objArr[1] = "getSubstitution";
                break;
            case 42:
                objArr[1] = "setJustForTypeSubstitution";
                break;
        }
        switch (i7) {
            case 8:
                objArr[2] = "setOwner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case BuildConfig.VERSION_CODE /* 30 */:
            case 31:
            case ConcurrentMapKt.INITIAL_CAPACITY /* 32 */:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                break;
            case 10:
                objArr[2] = "setModality";
                break;
            case 12:
                objArr[2] = "setVisibility";
                break;
            case 14:
                objArr[2] = "setKind";
                break;
            case 17:
                objArr[2] = "setName";
                break;
            case 19:
                objArr[2] = "setValueParameters";
                break;
            case 21:
                objArr[2] = "setTypeParameters";
                break;
            case 23:
                objArr[2] = "setReturnType";
                break;
            case 25:
                objArr[2] = "setContextReceiverParameters";
                break;
            case 35:
                objArr[2] = "setAdditionalAnnotations";
                break;
            case 37:
                objArr[2] = "setSubstitution";
                break;
            case 39:
                objArr[2] = "putUserData";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i7) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case BuildConfig.VERSION_CODE /* 30 */:
            case 31:
            case ConcurrentMapKt.INITIAL_CAPACITY /* 32 */:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                throw new IllegalStateException(str2);
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // u4.r
    public final u4.r a() {
        this.f17469m = false;
        return this;
    }

    @Override // u4.r
    public final u4.r b(List list) {
        this.f17463g = list;
        return this;
    }

    @Override // u4.r
    public final InterfaceC2112s build() {
        return this.f17480x.Q0(this);
    }

    @Override // u4.r
    public final u4.r d(InterfaceC2099e interfaceC2099e) {
        if (interfaceC2099e != null) {
            this.f17458b = interfaceC2099e;
            return this;
        }
        c(8);
        throw null;
    }

    @Override // u4.r
    public final u4.r e(AbstractC1586x abstractC1586x) {
        if (abstractC1586x != null) {
            this.f17467k = abstractC1586x;
            return this;
        }
        c(23);
        throw null;
    }

    @Override // u4.r
    public final u4.r f() {
        this.f17474r = P3.y.f7779k;
        return this;
    }

    @Override // u4.r
    public final u4.r g() {
        this.f17473q = true;
        return this;
    }

    @Override // u4.r
    public final u4.r h(H4.o oVar) {
        if (oVar != null) {
            this.f17460d = oVar;
            return this;
        }
        c(12);
        throw null;
    }

    @Override // u4.r
    public final u4.r i(int i7) {
        if (i7 != 0) {
            this.f17462f = i7;
            return this;
        }
        c(14);
        throw null;
    }

    @Override // u4.r
    public final u4.r j(EnumC2117x enumC2117x) {
        if (enumC2117x != null) {
            this.f17459c = enumC2117x;
            return this;
        }
        c(10);
        throw null;
    }

    @Override // u4.r
    public final u4.r k(v4.h hVar) {
        if (hVar != null) {
            this.f17475s = hVar;
            return this;
        }
        c(35);
        throw null;
    }

    @Override // u4.r
    public final u4.r l() {
        this.f17471o = true;
        return this;
    }

    @Override // u4.r
    public final u4.r m(C2295v c2295v) {
        this.f17466j = c2295v;
        return this;
    }

    @Override // u4.r
    public final u4.r n() {
        this.f17477u.put(J4.f.f4294Q, Boolean.TRUE);
        return this;
    }

    @Override // u4.r
    public final u4.r o() {
        this.f17476t = true;
        return this;
    }

    @Override // u4.r
    public final u4.r p(W4.e eVar) {
        if (eVar != null) {
            this.f17468l = eVar;
            return this;
        }
        c(17);
        throw null;
    }

    @Override // u4.r
    public final u4.r q() {
        this.f17470n = true;
        return this;
    }
}
