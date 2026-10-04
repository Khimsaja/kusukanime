package androidx.lifecycle;

import io.ktor.util.GzipHeaderFlags;
import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0688o {
    private static final /* synthetic */ V3.a $ENTRIES;
    private static final /* synthetic */ EnumC0688o[] $VALUES;
    public static final C0686m Companion;
    public static final EnumC0688o ON_ANY;
    public static final EnumC0688o ON_CREATE;
    public static final EnumC0688o ON_DESTROY;
    public static final EnumC0688o ON_PAUSE;
    public static final EnumC0688o ON_RESUME;
    public static final EnumC0688o ON_START;
    public static final EnumC0688o ON_STOP;

    static {
        EnumC0688o enumC0688o = new EnumC0688o("ON_CREATE", 0);
        ON_CREATE = enumC0688o;
        EnumC0688o enumC0688o2 = new EnumC0688o("ON_START", 1);
        ON_START = enumC0688o2;
        EnumC0688o enumC0688o3 = new EnumC0688o("ON_RESUME", 2);
        ON_RESUME = enumC0688o3;
        EnumC0688o enumC0688o4 = new EnumC0688o("ON_PAUSE", 3);
        ON_PAUSE = enumC0688o4;
        EnumC0688o enumC0688o5 = new EnumC0688o("ON_STOP", 4);
        ON_STOP = enumC0688o5;
        EnumC0688o enumC0688o6 = new EnumC0688o("ON_DESTROY", 5);
        ON_DESTROY = enumC0688o6;
        EnumC0688o enumC0688o7 = new EnumC0688o("ON_ANY", 6);
        ON_ANY = enumC0688o7;
        EnumC0688o[] enumC0688oArr = {enumC0688o, enumC0688o2, enumC0688o3, enumC0688o4, enumC0688o5, enumC0688o6, enumC0688o7};
        $VALUES = enumC0688oArr;
        $ENTRIES = AbstractC1420H.z(enumC0688oArr);
        Companion = new C0686m();
    }

    public static EnumC0688o valueOf(String str) {
        return (EnumC0688o) Enum.valueOf(EnumC0688o.class, str);
    }

    public static EnumC0688o[] values() {
        return (EnumC0688o[]) $VALUES.clone();
    }

    public final EnumC0689p a() {
        switch (AbstractC0687n.a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0689p.f10738m;
            case 3:
            case GzipHeaderFlags.EXTRA /* 4 */:
                return EnumC0689p.f10739n;
            case 5:
                return EnumC0689p.f10740o;
            case 6:
                return EnumC0689p.f10736k;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                throw new D6.r();
        }
    }
}
