package O1;

import H1.C0235p;
import O.C0486d;
import b1.AbstractC0703b;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;
import p.I0;
import y.C2301A;

/* renamed from: O1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0541o {
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7468b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7469c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f7470d;

    /* renamed from: e, reason: collision with root package name */
    public Object f7471e;

    /* renamed from: f, reason: collision with root package name */
    public Object f7472f;

    public C0541o(int i7, float f5, z.C c2) {
        this.f7468b = c2;
        this.f7469c = C0486d.J(i7);
        this.f7470d = C0486d.I(f5);
        this.f7472f = new C2301A(i7, 30, 100);
    }

    public i3.h a(int i7) {
        i3.h c0235p;
        i3.h hVar;
        i3.h hVar2;
        final int i8 = 2;
        final int i9 = 1;
        final int i10 = 3;
        HashMap map = (HashMap) this.f7469c;
        i3.h hVar3 = (i3.h) map.get(Integer.valueOf(i7));
        if (hVar3 != null) {
            return hVar3;
        }
        final E1.g gVar = (E1.g) this.f7471e;
        gVar.getClass();
        if (i7 != 0) {
            if (i7 == 1) {
                final GenericDeclaration genericDeclarationAsSubclass = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(A.class);
                hVar2 = new i3.h() { // from class: O1.n
                    @Override // i3.h
                    public final Object get() {
                        switch (i9) {
                            case 0:
                                return C0542p.e((Class) genericDeclarationAsSubclass, gVar);
                            case 1:
                                return C0542p.e((Class) genericDeclarationAsSubclass, gVar);
                            case 2:
                                return C0542p.e((Class) genericDeclarationAsSubclass, gVar);
                            default:
                                return new U(gVar, (V1.l) ((C0541o) genericDeclarationAsSubclass).f7468b);
                        }
                    }
                };
            } else if (i7 == 2) {
                final GenericDeclaration genericDeclarationAsSubclass2 = Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(A.class);
                hVar2 = new i3.h() { // from class: O1.n
                    @Override // i3.h
                    public final Object get() {
                        switch (i8) {
                            case 0:
                                return C0542p.e((Class) genericDeclarationAsSubclass2, gVar);
                            case 1:
                                return C0542p.e((Class) genericDeclarationAsSubclass2, gVar);
                            case 2:
                                return C0542p.e((Class) genericDeclarationAsSubclass2, gVar);
                            default:
                                return new U(gVar, (V1.l) ((C0541o) genericDeclarationAsSubclass2).f7468b);
                        }
                    }
                };
            } else {
                if (i7 != 3) {
                    if (i7 != 4) {
                        throw new IllegalArgumentException(AbstractC0703b.g(i7, "Unrecognized contentType: "));
                    }
                    hVar = new i3.h() { // from class: O1.n
                        @Override // i3.h
                        public final Object get() {
                            switch (i10) {
                                case 0:
                                    return C0542p.e((Class) this, gVar);
                                case 1:
                                    return C0542p.e((Class) this, gVar);
                                case 2:
                                    return C0542p.e((Class) this, gVar);
                                default:
                                    return new U(gVar, (V1.l) ((C0541o) this).f7468b);
                            }
                        }
                    };
                    map.put(Integer.valueOf(i7), hVar);
                    return hVar;
                }
                c0235p = new C0235p(i10, Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(A.class));
            }
            hVar = hVar2;
            map.put(Integer.valueOf(i7), hVar);
            return hVar;
        }
        final GenericDeclaration genericDeclarationAsSubclass3 = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(A.class);
        final int i11 = 0;
        c0235p = new i3.h() { // from class: O1.n
            @Override // i3.h
            public final Object get() {
                switch (i11) {
                    case 0:
                        return C0542p.e((Class) genericDeclarationAsSubclass3, gVar);
                    case 1:
                        return C0542p.e((Class) genericDeclarationAsSubclass3, gVar);
                    case 2:
                        return C0542p.e((Class) genericDeclarationAsSubclass3, gVar);
                    default:
                        return new U(gVar, (V1.l) ((C0541o) genericDeclarationAsSubclass3).f7468b);
                }
            }
        };
        hVar = c0235p;
        map.put(Integer.valueOf(i7), hVar);
        return hVar;
    }

    public C0541o(V1.l lVar, I0 i02) {
        this.f7468b = lVar;
        this.f7472f = i02;
        this.f7469c = new HashMap();
        this.f7470d = new HashMap();
        this.a = true;
    }
}
