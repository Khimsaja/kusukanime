package a6;

/* loaded from: classes.dex */
public final class j {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10475b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10476c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10477d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10478e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10479f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10480g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f10481h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f10482i;

    /* renamed from: j, reason: collision with root package name */
    public final EnumC0671a f10483j;

    public j(boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, String str, String str2, boolean z12, boolean z13, EnumC0671a enumC0671a) {
        kotlin.jvm.internal.l.f("prettyPrintIndent", str);
        kotlin.jvm.internal.l.f("classDiscriminator", str2);
        kotlin.jvm.internal.l.f("classDiscriminatorMode", enumC0671a);
        this.a = z7;
        this.f10475b = z8;
        this.f10476c = z9;
        this.f10477d = z10;
        this.f10478e = z11;
        this.f10479f = str;
        this.f10480g = str2;
        this.f10481h = z12;
        this.f10482i = z13;
        this.f10483j = enumC0671a;
    }

    public final String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.a + ", ignoreUnknownKeys=" + this.f10475b + ", isLenient=" + this.f10476c + ", allowStructuredMapKeys=" + this.f10477d + ", prettyPrint=false, explicitNulls=" + this.f10478e + ", prettyPrintIndent='" + this.f10479f + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + this.f10480g + "', allowSpecialFloatingPointValues=" + this.f10481h + ", useAlternativeNames=" + this.f10482i + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + this.f10483j + ')';
    }
}
