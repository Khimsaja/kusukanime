package R4;

import X4.InterfaceC0619p;

/* loaded from: classes.dex */
public enum f0 implements InterfaceC0619p {
    LANGUAGE_VERSION(0),
    COMPILER_VERSION(1),
    API_VERSION(2);


    /* renamed from: k, reason: collision with root package name */
    public final int f8465k;

    f0(int i7) {
        this.f8465k = i7;
    }

    @Override // X4.InterfaceC0619p
    public final int a() {
        return this.f8465k;
    }
}
