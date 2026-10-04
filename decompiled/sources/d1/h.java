package d1;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import c1.C0748b;
import c1.C0749c;
import g1.i;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import l4.AbstractC1420H;

/* loaded from: classes.dex */
public final class h extends AbstractC1420H {
    public static Font S(FontFamily fontFamily) {
        FontStyle fontStyle = new FontStyle(400, 0);
        Font font = fontFamily.getFont(0);
        int iU = U(fontStyle, font.getStyle());
        for (int i7 = 1; i7 < fontFamily.getSize(); i7++) {
            Font font2 = fontFamily.getFont(i7);
            int iU2 = U(fontStyle, font2.getStyle());
            if (iU2 < iU) {
                font = font2;
                iU = iU2;
            }
        }
        return font;
    }

    public static FontFamily T(i[] iVarArr, ContentResolver contentResolver) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FontFamily.Builder builder = null;
        for (i iVar : iVarArr) {
            try {
                parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(iVar.a, "r", null);
            } catch (IOException e7) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            }
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                }
            } else {
                try {
                    Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(iVar.f11687c).setSlant(iVar.f11688d ? 1 : 0).setTtcIndex(iVar.f11686b).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            parcelFileDescriptorOpenFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static int U(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // l4.AbstractC1420H
    public final i A(i[] iVarArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // l4.AbstractC1420H
    public final Typeface s(Context context, C0748b c0748b, Resources resources) throws IOException {
        try {
            FontFamily.Builder builder = null;
            for (C0749c c0749c : c0748b.a) {
                try {
                    Font fontBuild = new Font.Builder(resources, c0749c.f11141f).setWeight(c0749c.f11137b).setSlant(c0749c.f11138c ? 1 : 0).setTtcIndex(c0749c.f11140e).setFontVariationSettings(c0749c.f11139d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(S(fontFamilyBuild).getStyle()).build();
        } catch (Exception e7) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    @Override // l4.AbstractC1420H
    public final Typeface t(Context context, i[] iVarArr) {
        try {
            FontFamily fontFamilyT = T(iVarArr, context.getContentResolver());
            if (fontFamilyT == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyT).setStyle(S(fontFamilyT).getStyle()).build();
        } catch (Exception e7) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    @Override // l4.AbstractC1420H
    public final Typeface u(Context context, List list) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyT = T((i[]) list.get(0), contentResolver);
            if (fontFamilyT == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyT);
            for (int i7 = 1; i7 < list.size(); i7++) {
                FontFamily fontFamilyT2 = T((i[]) list.get(i7), contentResolver);
                if (fontFamilyT2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyT2);
                }
            }
            return customFallbackBuilder.setStyle(S(fontFamilyT).getStyle()).build();
        } catch (Exception e7) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    @Override // l4.AbstractC1420H
    public final Typeface v(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // l4.AbstractC1420H
    public final Typeface w(Context context, Resources resources, int i7, String str) throws IOException {
        try {
            Font fontBuild = new Font.Builder(resources, i7).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e7) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }
}
