package io.github.jan.supabase.storage;

import io.github.jan.supabase.annotations.SupabaseInternal;
import io.ktor.http.ContentDisposition;
import io.ktor.http.HttpUrlEncodedKt;
import io.ktor.http.ParametersBuilder;
import io.ktor.http.ParametersKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import l4.AbstractC1420H;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 &2\u00020\u0001:\u0002%&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010 \u001a\u00020\u001fJ\u0006\u0010!\u001a\u00020\u001fJ\u0006\u0010\"\u001a\u00020\u001fJ\r\u0010#\u001a\u00020\u0013H\u0000¢\u0006\u0002\b$R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR*\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006'"}, d2 = {"Lio/github/jan/supabase/storage/ImageTransformation;", "", "<init>", "()V", "width", "", "getWidth", "()Ljava/lang/Integer;", "setWidth", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "height", "getHeight", "setHeight", "value", "quality", "getQuality", "setQuality", "format", "", "getFormat", "()Ljava/lang/String;", "setFormat", "(Ljava/lang/String;)V", "resize", "Lio/github/jan/supabase/storage/ImageTransformation$Resize;", "getResize", "()Lio/github/jan/supabase/storage/ImageTransformation$Resize;", "setResize", "(Lio/github/jan/supabase/storage/ImageTransformation$Resize;)V", ContentDisposition.Parameters.Size, "", "cover", "contain", "fill", "queryString", "queryString$storage_kt_release", "Resize", "Companion", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImageTransformation {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final k4.g VALID_QUALITY_RANGE = new k4.g(1, 100, 1);
    private String format;
    private Integer height;
    private Integer quality;
    private Resize resize;
    private Integer width;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/github/jan/supabase/storage/ImageTransformation$Companion;", "", "<init>", "()V", "VALID_QUALITY_RANGE", "Lkotlin/ranges/IntRange;", "getVALID_QUALITY_RANGE$annotations", "getVALID_QUALITY_RANGE", "()Lkotlin/ranges/IntRange;", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        @SupabaseInternal
        public static /* synthetic */ void getVALID_QUALITY_RANGE$annotations() {
        }

        public final k4.g getVALID_QUALITY_RANGE() {
            return ImageTransformation.VALID_QUALITY_RANGE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/storage/ImageTransformation$Resize;", "", "<init>", "(Ljava/lang/String;I)V", "COVER", "CONTAIN", "FILL", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Resize {
        private static final /* synthetic */ V3.a $ENTRIES;
        private static final /* synthetic */ Resize[] $VALUES;
        public static final Resize COVER = new Resize("COVER", 0);
        public static final Resize CONTAIN = new Resize("CONTAIN", 1);
        public static final Resize FILL = new Resize("FILL", 2);

        private static final /* synthetic */ Resize[] $values() {
            return new Resize[]{COVER, CONTAIN, FILL};
        }

        static {
            Resize[] resizeArr$values = $values();
            $VALUES = resizeArr$values;
            $ENTRIES = AbstractC1420H.z(resizeArr$values);
        }

        private Resize(String str, int i7) {
        }

        public static V3.a getEntries() {
            return $ENTRIES;
        }

        public static Resize valueOf(String str) {
            return (Resize) Enum.valueOf(Resize.class, str);
        }

        public static Resize[] values() {
            return (Resize[]) $VALUES.clone();
        }
    }

    public final void contain() {
        this.resize = Resize.CONTAIN;
    }

    public final void cover() {
        this.resize = Resize.COVER;
    }

    public final void fill() {
        this.resize = Resize.FILL;
    }

    public final String getFormat() {
        return this.format;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final Integer getQuality() {
        return this.quality;
    }

    public final Resize getResize() {
        return this.resize;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public final String queryString$storage_kt_release() {
        ParametersBuilder parametersBuilderParametersBuilder$default = ParametersKt.ParametersBuilder$default(0, 1, null);
        Integer num = this.width;
        if (num != null) {
            parametersBuilderParametersBuilder$default.append("width", String.valueOf(num.intValue()));
        }
        Integer num2 = this.height;
        if (num2 != null) {
            parametersBuilderParametersBuilder$default.append("height", String.valueOf(num2.intValue()));
        }
        Resize resize = this.resize;
        if (resize != null) {
            String lowerCase = resize.name().toLowerCase(Locale.ROOT);
            l.e("toLowerCase(...)", lowerCase);
            parametersBuilderParametersBuilder$default.append("resize", lowerCase);
        }
        Integer num3 = this.quality;
        if (num3 != null) {
            parametersBuilderParametersBuilder$default.append("quality", String.valueOf(num3.intValue()));
        }
        String str = this.format;
        if (str != null) {
            parametersBuilderParametersBuilder$default.append("format", str);
        }
        return HttpUrlEncodedKt.formUrlEncode(parametersBuilderParametersBuilder$default.build());
    }

    public final void setFormat(String str) {
        this.format = str;
    }

    public final void setHeight(Integer num) {
        this.height = num;
    }

    public final void setQuality(Integer num) {
        k4.g gVar = VALID_QUALITY_RANGE;
        if (num == null || !gVar.h(num.intValue())) {
            throw new IllegalArgumentException("Quality must be between 1 and 100");
        }
        this.quality = num;
    }

    public final void setResize(Resize resize) {
        this.resize = resize;
    }

    public final void setWidth(Integer num) {
        this.width = num;
    }

    public final void size(int width, int height) {
        this.width = Integer.valueOf(width);
        this.height = Integer.valueOf(height);
    }
}
