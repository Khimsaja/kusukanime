package T4;

import X4.InterfaceC0619p;

/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0619p[] f9066c;

    /* JADX WARN: Illegal instructions before constructor call */
    public c(int i7, InterfaceC0619p[] interfaceC0619pArr) {
        if (interfaceC0619pArr == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
        }
        int i8 = 1;
        int length = interfaceC0619pArr.length - 1;
        if (length != 0) {
            for (int i9 = 31; i9 >= 0; i9--) {
                if (((1 << i9) & length) != 0) {
                    i8 = 1 + i9;
                }
            }
            throw new IllegalStateException("Empty enum: " + interfaceC0619pArr.getClass());
        }
        super(i7, i8);
        this.f9066c = interfaceC0619pArr;
    }

    public final Object c(int i7) {
        int i8 = (1 << this.f9067b) - 1;
        int i9 = this.a;
        int i10 = (i7 & (i8 << i9)) >> i9;
        for (InterfaceC0619p interfaceC0619p : this.f9066c) {
            if (interfaceC0619p.a() == i10) {
                return interfaceC0619p;
            }
        }
        return null;
    }
}
