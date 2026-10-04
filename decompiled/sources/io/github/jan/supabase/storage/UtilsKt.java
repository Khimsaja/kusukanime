package io.github.jan.supabase.storage;

import a6.v;
import io.github.jan.supabase.storage.ImageTransformation;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"putImageTransformation", "", "Lkotlinx/serialization/json/JsonObjectBuilder;", "transformation", "Lio/github/jan/supabase/storage/ImageTransformation;", "storage-kt_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UtilsKt {
    public static final void putImageTransformation(v vVar, ImageTransformation imageTransformation) {
        l.f("<this>", vVar);
        l.f("transformation", imageTransformation);
        Integer width = imageTransformation.getWidth();
        if (width != null) {
            vVar.b("width", a6.l.a(Integer.valueOf(width.intValue())));
        }
        Integer height = imageTransformation.getHeight();
        if (height != null) {
            vVar.b("height", a6.l.a(Integer.valueOf(height.intValue())));
        }
        ImageTransformation.Resize resize = imageTransformation.getResize();
        if (resize != null) {
            String lowerCase = resize.name().toLowerCase(Locale.ROOT);
            l.e("toLowerCase(...)", lowerCase);
            n6.d.V("resize", lowerCase, vVar);
        }
        Integer quality = imageTransformation.getQuality();
        if (quality != null) {
            vVar.b("quality", a6.l.a(Integer.valueOf(quality.intValue())));
        }
        String format = imageTransformation.getFormat();
        if (format != null) {
            n6.d.V("format", format, vVar);
        }
    }
}
