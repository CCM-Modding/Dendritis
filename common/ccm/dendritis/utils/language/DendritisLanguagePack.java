package ccm.dendritis.utils.language;

import java.util.ArrayList;
import java.util.List;

import ccm.dendritis.utils.lib.Locations;
import ccm.nucleum_omnium.helper.LanguageHelper;
import ccm.nucleum_omnium.utils.language.ILanguagePack;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class DendritisLanguagePack extends ILanguagePack {
    
    /**
     * Private {@code List<String>} that contains the languages, Shared with all Language Packs
     */
    private final List<String> supportedLanguages = new ArrayList<String>();
    
    /**
     * Adds all the supported Languages
     */
    public DendritisLanguagePack() {
        super(Locations.LANGUAGE_FILE);
        supportedLanguages.add(getPath("en_US"));
        supportedLanguages.add(getPath("es_ES"));
    }
    
    @Override
    public void loadLangs() {
        for (final String langFile : supportedLanguages) {
            LanguageRegistry.instance().loadLocalization(langFile, LanguageHelper.getLangFromFileName(langFile), LanguageHelper.isXMLLanguageFile(langFile));
        }
    }
}