package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * https://scryfall.com/sets/td0
 */
public class MagicOnlineThemeDecks extends ExpansionSet {

    private static final MagicOnlineThemeDecks instance = new MagicOnlineThemeDecks();

    public static MagicOnlineThemeDecks getInstance() {
        return instance;
    }

    private MagicOnlineThemeDecks() {
        super("Magic Online Theme Decks", "TD0", ExpansionSet.buildDate(2010, 11, 8), SetType.MAGIC_ONLINE);
        this.hasBoosters = false;
        this.hasBasicLands = true;

        cards.add(new SetCardInfo("Abyssal Gatekeeper", "A34", Rarity.COMMON, mage.cards.a.AbyssalGatekeeper.class));
        cards.add(new SetCardInfo("Aether Vial", "B27", Rarity.UNCOMMON, mage.cards.a.AetherVial.class));
        cards.add(new SetCardInfo("All Hallow's Eve", "A35", Rarity.RARE, mage.cards.a.AllHallowsEve.class));
        cards.add(new SetCardInfo("Anarchist", "A52", Rarity.COMMON, mage.cards.a.Anarchist.class));
        cards.add(new SetCardInfo("Ancient Grudge", "A53", Rarity.COMMON, mage.cards.a.AncientGrudge.class));
        cards.add(new SetCardInfo("Anger", "A54", Rarity.UNCOMMON, mage.cards.a.Anger.class));
        cards.add(new SetCardInfo("Animate Dead", "A36", Rarity.UNCOMMON, mage.cards.a.AnimateDead.class));
        cards.add(new SetCardInfo("Armadillo Cloak", "A94", Rarity.UNCOMMON, mage.cards.a.ArmadilloCloak.class));
        cards.add(new SetCardInfo("Ashes to Ashes", "A37", Rarity.UNCOMMON, mage.cards.a.AshesToAshes.class));
        cards.add(new SetCardInfo("Aura of Silence", "B1", Rarity.UNCOMMON, mage.cards.a.AuraOfSilence.class));
        cards.add(new SetCardInfo("Auramancer", "A1", Rarity.COMMON, mage.cards.a.Auramancer.class));
        cards.add(new SetCardInfo("Avatar of Woe", "A38", Rarity.RARE, mage.cards.a.AvatarOfWoe.class));
        cards.add(new SetCardInfo("Azorius Chancery", "A121", Rarity.UNCOMMON, mage.cards.a.AzoriusChancery.class));
        cards.add(new SetCardInfo("Azorius Guildmage", "A95", Rarity.UNCOMMON, mage.cards.a.AzoriusGuildmage.class));
        cards.add(new SetCardInfo("Azorius Signet", "A111", Rarity.COMMON, mage.cards.a.AzoriusSignet.class));
        cards.add(new SetCardInfo("Bant Panorama", "A122", Rarity.COMMON, mage.cards.b.BantPanorama.class));
        cards.add(new SetCardInfo("Barren Moor", "A123", Rarity.COMMON, mage.cards.b.BarrenMoor.class));
        cards.add(new SetCardInfo("Benevolent Bodyguard", "B2", Rarity.COMMON, mage.cards.b.BenevolentBodyguard.class));
        cards.add(new SetCardInfo("Bonesplitter", "B28", Rarity.COMMON, mage.cards.b.Bonesplitter.class));
        cards.add(new SetCardInfo("Borderland Ranger", "A62", Rarity.COMMON, mage.cards.b.BorderlandRanger.class));
        cards.add(new SetCardInfo("Brawn", "A63", Rarity.UNCOMMON, mage.cards.b.Brawn.class));
        cards.add(new SetCardInfo("Buried Alive", "A39", Rarity.UNCOMMON, mage.cards.b.BuriedAlive.class));
        cards.add(new SetCardInfo("Capsize", "A18", Rarity.COMMON, mage.cards.c.Capsize.class));
        cards.add(new SetCardInfo("Carrion Feeder", "A40", Rarity.COMMON, mage.cards.c.CarrionFeeder.class));
        cards.add(new SetCardInfo("Cauldron Dance", "A96", Rarity.UNCOMMON, mage.cards.c.CauldronDance.class));
        cards.add(new SetCardInfo("Chain Lightning", "A55", Rarity.COMMON, mage.cards.c.ChainLightning.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Chain Lightning", "B14", Rarity.COMMON, mage.cards.c.ChainLightning.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Chartooth Cougar", "A56", Rarity.COMMON, mage.cards.c.ChartoothCougar.class));
        cards.add(new SetCardInfo("Civic Wayfinder", "A64", Rarity.COMMON, mage.cards.c.CivicWayfinder.class));
        cards.add(new SetCardInfo("Coastal Tower", "A124", Rarity.UNCOMMON, mage.cards.c.CoastalTower.class));
        cards.add(new SetCardInfo("Coiling Oracle", "A97", Rarity.UNCOMMON, mage.cards.c.CoilingOracle.class));
        cards.add(new SetCardInfo("Compulsive Research", "A19", Rarity.COMMON, mage.cards.c.CompulsiveResearch.class));
        cards.add(new SetCardInfo("Concordant Crossroads", "A65", Rarity.UNCOMMON, mage.cards.c.ConcordantCrossroads.class));
        cards.add(new SetCardInfo("Condemn", "A2", Rarity.UNCOMMON, mage.cards.c.Condemn.class));
        cards.add(new SetCardInfo("Confiscate", "A20", Rarity.UNCOMMON, mage.cards.c.Confiscate.class));
        cards.add(new SetCardInfo("Constant Mists", "A66", Rarity.UNCOMMON, mage.cards.c.ConstantMists.class));
        cards.add(new SetCardInfo("Copy Enchantment", "A21", Rarity.RARE, mage.cards.c.CopyEnchantment.class));
        cards.add(new SetCardInfo("Court Hussar", "A22", Rarity.UNCOMMON, mage.cards.c.CourtHussar.class));
        cards.add(new SetCardInfo("Darigaaz's Caldera", "A125", Rarity.UNCOMMON, mage.cards.d.DarigaazsCaldera.class));
        cards.add(new SetCardInfo("Decree of Justice", "A3", Rarity.RARE, mage.cards.d.DecreeOfJustice.class));
        cards.add(new SetCardInfo("Dismantling Blow", "A4", Rarity.COMMON, mage.cards.d.DismantlingBlow.class));
        cards.add(new SetCardInfo("Dread Return", "A41", Rarity.UNCOMMON, mage.cards.d.DreadReturn.class));
        cards.add(new SetCardInfo("Edge of Autumn", "A67", Rarity.COMMON, mage.cards.e.EdgeOfAutumn.class));
        cards.add(new SetCardInfo("Elfhame Palace", "A126", Rarity.UNCOMMON, mage.cards.e.ElfhamePalace.class));
        cards.add(new SetCardInfo("Elven Cache", "A68", Rarity.COMMON, mage.cards.e.ElvenCache.class));
        cards.add(new SetCardInfo("Elvish Visionary", "A69", Rarity.COMMON, mage.cards.e.ElvishVisionary.class));
        cards.add(new SetCardInfo("Empyrial Armor", "A5", Rarity.UNCOMMON, mage.cards.e.EmpyrialArmor.class));
        cards.add(new SetCardInfo("Enlightened Tutor", "A6", Rarity.RARE, mage.cards.e.EnlightenedTutor.class));
        cards.add(new SetCardInfo("Eternal Witness", "A70", Rarity.UNCOMMON, mage.cards.e.EternalWitness.class));
        cards.add(new SetCardInfo("Ethersworn Canonist", "B3", Rarity.RARE, mage.cards.e.EtherswornCanonist.class));
        cards.add(new SetCardInfo("Explosive Vegetation", "A71", Rarity.UNCOMMON, mage.cards.e.ExplosiveVegetation.class));
        cards.add(new SetCardInfo("Fact or Fiction", "A23", Rarity.UNCOMMON, mage.cards.f.FactOrFiction.class));
        cards.add(new SetCardInfo("Faith's Fetters", "A7", Rarity.UNCOMMON, mage.cards.f.FaithsFetters.class));
        cards.add(new SetCardInfo("Fertile Ground", "A72", Rarity.COMMON, mage.cards.f.FertileGround.class));
        cards.add(new SetCardInfo("Fireblast", "B15", Rarity.COMMON, mage.cards.f.Fireblast.class));
        cards.add(new SetCardInfo("Fires of Yavimaya", "A98", Rarity.UNCOMMON, mage.cards.f.FiresOfYavimaya.class));
        cards.add(new SetCardInfo("Flagstones of Trokair", "B31", Rarity.RARE, mage.cards.f.FlagstonesOfTrokair.class));
        cards.add(new SetCardInfo("Flames of the Blood Hand", "B16", Rarity.UNCOMMON, mage.cards.f.FlamesOfTheBloodHand.class));
        cards.add(new SetCardInfo("Flametongue Kavu", "A57", Rarity.UNCOMMON, mage.cards.f.FlametongueKavu.class));
        cards.add(new SetCardInfo("Flickerwisp", "B4", Rarity.UNCOMMON, mage.cards.f.Flickerwisp.class));
        cards.add(new SetCardInfo("Forest", "A154", Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", "A155", Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", "A156", Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forgotten Cave", "A127", Rarity.COMMON, mage.cards.f.ForgottenCave.class));
        cards.add(new SetCardInfo("Genesis", "A73", Rarity.RARE, mage.cards.g.Genesis.class));
        cards.add(new SetCardInfo("Ghost Quarter", "A128", Rarity.UNCOMMON, mage.cards.g.GhostQuarter.class));
        cards.add(new SetCardInfo("Ghostly Prison", "A8", Rarity.UNCOMMON, mage.cards.g.GhostlyPrison.class));
        cards.add(new SetCardInfo("Goblin Guide", "B17", Rarity.RARE, mage.cards.g.GoblinGuide.class));
        cards.add(new SetCardInfo("Golgari Grave-Troll", "A74", Rarity.RARE, mage.cards.g.GolgariGraveTroll.class));
        cards.add(new SetCardInfo("Golgari Rot Farm", "A129", Rarity.COMMON, mage.cards.g.GolgariRotFarm.class));
        cards.add(new SetCardInfo("Golgari Signet", "A112", Rarity.COMMON, mage.cards.g.GolgariSignet.class));
        cards.add(new SetCardInfo("Golgari Thug", "A42", Rarity.UNCOMMON, mage.cards.g.GolgariThug.class));
        cards.add(new SetCardInfo("Grim Harvest", "A43", Rarity.COMMON, mage.cards.g.GrimHarvest.class));
        cards.add(new SetCardInfo("Gruul Signet", "A113", Rarity.COMMON, mage.cards.g.GruulSignet.class));
        cards.add(new SetCardInfo("Gruul Turf", "A130", Rarity.COMMON, mage.cards.g.GruulTurf.class));
        cards.add(new SetCardInfo("Harmonize", "A75", Rarity.UNCOMMON, mage.cards.h.Harmonize.class));
        cards.add(new SetCardInfo("Hellspark Elemental", "B18", Rarity.UNCOMMON, mage.cards.h.HellsparkElemental.class));
        cards.add(new SetCardInfo("Hinder", "A24", Rarity.UNCOMMON, mage.cards.h.Hinder.class));
        cards.add(new SetCardInfo("Hissing Iguanar", "A58", Rarity.COMMON, mage.cards.h.HissingIguanar.class));
        // Card not implemented
        //cards.add(new SetCardInfo("Illusionary Mask", "A114", Rarity.RARE, mage.cards.i.IllusionaryMask.class));
        cards.add(new SetCardInfo("Island", "A145", Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", "A146", Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", "A147", Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Jund Panorama", "A131", Rarity.COMMON, mage.cards.j.JundPanorama.class));
        cards.add(new SetCardInfo("Jungle Barrier", "A99", Rarity.UNCOMMON, mage.cards.j.JungleBarrier.class));
        cards.add(new SetCardInfo("Jungle Lion", "A76", Rarity.COMMON, mage.cards.j.JungleLion.class));
        cards.add(new SetCardInfo("Jotun Grunt", "B5", Rarity.UNCOMMON, mage.cards.j.JotunGrunt.class));
        cards.add(new SetCardInfo("Kami of Ancient Law", "A9", Rarity.COMMON, mage.cards.k.KamiOfAncientLaw.class));
        cards.add(new SetCardInfo("Karakas", "B32", Rarity.RARE, mage.cards.k.Karakas.class));
        cards.add(new SetCardInfo("Keldon Marauders", "B19", Rarity.COMMON, mage.cards.k.KeldonMarauders.class));
        cards.add(new SetCardInfo("Keldon Vandals", "A59", Rarity.COMMON, mage.cards.k.KeldonVandals.class));
        cards.add(new SetCardInfo("Kodama's Reach", "A77", Rarity.COMMON, mage.cards.k.KodamasReach.class));
        cards.add(new SetCardInfo("Kor Firewalker", "B6", Rarity.UNCOMMON, mage.cards.k.KorFirewalker.class));
        cards.add(new SetCardInfo("Krosan Tusker", "A78", Rarity.COMMON, mage.cards.k.KrosanTusker.class));
        cards.add(new SetCardInfo("Lava Spike", "B20", Rarity.COMMON, mage.cards.l.LavaSpike.class));
        cards.add(new SetCardInfo("Life from the Loam", "A79", Rarity.RARE, mage.cards.l.LifeFromTheLoam.class));
        cards.add(new SetCardInfo("Lightning Bolt", "A60", Rarity.COMMON, mage.cards.l.LightningBolt.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Lightning Bolt", "B21", Rarity.COMMON, mage.cards.l.LightningBolt.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Lightning Greaves", "A115", Rarity.UNCOMMON, mage.cards.l.LightningGreaves.class));
        cards.add(new SetCardInfo("Looter il-Kor", "A25", Rarity.COMMON, mage.cards.l.LooterIlKor.class));
        cards.add(new SetCardInfo("Magma Jet", "B22", Rarity.UNCOMMON, mage.cards.m.MagmaJet.class));
        cards.add(new SetCardInfo("Man-o'-War", "A26", Rarity.COMMON, mage.cards.m.ManOWar.class));
        cards.add(new SetCardInfo("Mangara of Corondor", "B7", Rarity.RARE, mage.cards.m.MangaraOfCorondor.class));
        cards.add(new SetCardInfo("Massacre", "A44", Rarity.UNCOMMON, mage.cards.m.Massacre.class));
        cards.add(new SetCardInfo("Merfolk Looter", "A27", Rarity.COMMON, mage.cards.m.MerfolkLooter.class));
        cards.add(new SetCardInfo("Mirari's Wake", "A100", Rarity.RARE, mage.cards.m.MirarisWake.class));
        cards.add(new SetCardInfo("Miren, the Moaning Well", "A132", Rarity.RARE, mage.cards.m.MirenTheMoaningWell.class));
        cards.add(new SetCardInfo("Mishra's Factory", "B33", Rarity.UNCOMMON, mage.cards.m.MishrasFactory.class));
        cards.add(new SetCardInfo("Mistmeadow Witch", "A101", Rarity.UNCOMMON, mage.cards.m.MistmeadowWitch.class));
        cards.add(new SetCardInfo("Moment's Peace", "A80", Rarity.COMMON, mage.cards.m.MomentsPeace.class));
        cards.add(new SetCardInfo("Momentary Blink", "A10", Rarity.COMMON, mage.cards.m.MomentaryBlink.class));
        cards.add(new SetCardInfo("Mountain", "A151", Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", "A152", Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", "A153", Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", "B38", Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", "B39", Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", "B40", Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", "B41", Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mulldrifter", "A28", Rarity.COMMON, mage.cards.m.Mulldrifter.class));
        cards.add(new SetCardInfo("Nezumi Graverobber", "A45", Rarity.UNCOMMON, mage.cards.n.NezumiGraverobber.class));
        cards.add(new SetCardInfo("Noble Templar", "A11", Rarity.COMMON, mage.cards.n.NobleTemplar.class));
        cards.add(new SetCardInfo("Oblivion Ring", "A12", Rarity.COMMON, mage.cards.o.OblivionRing.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Oblivion Ring", "B8", Rarity.COMMON, mage.cards.o.OblivionRing.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Overwhelming Intellect", "A29", Rarity.UNCOMMON, mage.cards.o.OverwhelmingIntellect.class));
        cards.add(new SetCardInfo("Penumbra Bobcat", "A81", Rarity.COMMON, mage.cards.p.PenumbraBobcat.class));
        cards.add(new SetCardInfo("Phantom Centaur", "A82", Rarity.UNCOMMON, mage.cards.p.PhantomCentaur.class));
        cards.add(new SetCardInfo("Phyrexian Arena", "A46", Rarity.RARE, mage.cards.p.PhyrexianArena.class));
        cards.add(new SetCardInfo("Plains", "A142", Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", "A143", Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", "A144", Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", "B34", Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", "B35", Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", "B36", Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", "B37", Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Price of Progress", "B23", Rarity.UNCOMMON, mage.cards.p.PriceOfProgress.class));
        cards.add(new SetCardInfo("Prison Term", "A13", Rarity.UNCOMMON, mage.cards.p.PrisonTerm.class));
        cards.add(new SetCardInfo("Putrefy", "A102", Rarity.UNCOMMON, mage.cards.p.Putrefy.class));
        cards.add(new SetCardInfo("Pyroblast", "B24", Rarity.COMMON, mage.cards.p.Pyroblast.class));
        cards.add(new SetCardInfo("Pyrostatic Pillar", "B25", Rarity.UNCOMMON, mage.cards.p.PyrostaticPillar.class));
        cards.add(new SetCardInfo("Questing Phelddagrif", "A103", Rarity.RARE, mage.cards.q.QuestingPhelddagrif.class));
        cards.add(new SetCardInfo("Rakdos Carnarium", "A133", Rarity.COMMON, mage.cards.r.RakdosCarnarium.class));
        cards.add(new SetCardInfo("Rakdos Signet", "A116", Rarity.COMMON, mage.cards.r.RakdosSignet.class));
        cards.add(new SetCardInfo("Rampant Growth", "A83", Rarity.COMMON, mage.cards.r.RampantGrowth.class));
        cards.add(new SetCardInfo("Raven Familiar", "A30", Rarity.UNCOMMON, mage.cards.r.RavenFamiliar.class));
        cards.add(new SetCardInfo("Reaping the Graves", "A47", Rarity.COMMON, mage.cards.r.ReapingTheGraves.class));
        cards.add(new SetCardInfo("Recollect", "A84", Rarity.UNCOMMON, mage.cards.r.Recollect.class));
        cards.add(new SetCardInfo("Relic of Progenitus", "A117", Rarity.UNCOMMON, mage.cards.r.RelicOfProgenitus.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Relic of Progenitus", "B29", Rarity.UNCOMMON, mage.cards.r.RelicOfProgenitus.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Resounding Thunder", "A61", Rarity.COMMON, mage.cards.r.ResoundingThunder.class));
        cards.add(new SetCardInfo("Resurrection", "A14", Rarity.UNCOMMON, mage.cards.r.Resurrection.class));
        cards.add(new SetCardInfo("Rhystic Study", "A31", Rarity.COMMON, mage.cards.r.RhysticStudy.class));
        cards.add(new SetCardInfo("Rift Bolt", "B26", Rarity.COMMON, mage.cards.r.RiftBolt.class));
        cards.add(new SetCardInfo("Rootbreaker Wurm", "A85", Rarity.COMMON, mage.cards.r.RootbreakerWurm.class));
        cards.add(new SetCardInfo("Rubinia Soulsinger", "A104", Rarity.RARE, mage.cards.r.RubiniaSoulsinger.class));
        cards.add(new SetCardInfo("Rupture Spire", "A134", Rarity.COMMON, mage.cards.r.RuptureSpire.class));
        cards.add(new SetCardInfo("Sakura-Tribe Elder", "A86", Rarity.COMMON, mage.cards.s.SakuraTribeElder.class));
        cards.add(new SetCardInfo("Savage Lands", "A135", Rarity.UNCOMMON, mage.cards.s.SavageLands.class));
        cards.add(new SetCardInfo("Seal of Cleansing", "A15", Rarity.COMMON, mage.cards.s.SealOfCleansing.class));
        cards.add(new SetCardInfo("Seaside Citadel", "A136", Rarity.UNCOMMON, mage.cards.s.SeasideCitadel.class));
        cards.add(new SetCardInfo("Selesnya Sanctuary", "A137", Rarity.UNCOMMON, mage.cards.s.SelesnyaSanctuary.class));
        cards.add(new SetCardInfo("Selesnya Signet", "A118", Rarity.COMMON, mage.cards.s.SelesnyaSignet.class));
        cards.add(new SetCardInfo("Serra Avenger", "B9", Rarity.RARE, mage.cards.s.SerraAvenger.class));
        cards.add(new SetCardInfo("Shambling Shell", "A105", Rarity.COMMON, mage.cards.s.ShamblingShell.class));
        cards.add(new SetCardInfo("Shoreline Ranger", "A32", Rarity.COMMON, mage.cards.s.ShorelineRanger.class));
        cards.add(new SetCardInfo("Shriekmaw", "A48", Rarity.UNCOMMON, mage.cards.s.Shriekmaw.class));
        cards.add(new SetCardInfo("Silence", "B10", Rarity.RARE, mage.cards.s.Silence.class));
        cards.add(new SetCardInfo("Simic Growth Chamber", "A138", Rarity.UNCOMMON, mage.cards.s.SimicGrowthChamber.class));
        cards.add(new SetCardInfo("Simic Signet", "A119", Rarity.COMMON, mage.cards.s.SimicSignet.class));
        cards.add(new SetCardInfo("Skullclamp", "A120", Rarity.UNCOMMON, mage.cards.s.Skullclamp.class));
        cards.add(new SetCardInfo("Sterling Grove", "A106", Rarity.UNCOMMON, mage.cards.s.SterlingGrove.class));
        cards.add(new SetCardInfo("Stinkweed Imp", "A49", Rarity.UNCOMMON, mage.cards.s.StinkweedImp.class));
        cards.add(new SetCardInfo("Stonecloaker", "A16", Rarity.UNCOMMON, mage.cards.s.Stonecloaker.class));
        cards.add(new SetCardInfo("Stoneforge Mystic", "B11", Rarity.RARE, mage.cards.s.StoneforgeMystic.class));
        cards.add(new SetCardInfo("Swamp", "A148", Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", "A149", Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", "A150", Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swords to Plowshares", "A17", Rarity.UNCOMMON, mage.cards.s.SwordsToPlowshares.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swords to Plowshares", "B12", Rarity.UNCOMMON, mage.cards.s.SwordsToPlowshares.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Temporal Spring", "A107", Rarity.COMMON, mage.cards.t.TemporalSpring.class));
        cards.add(new SetCardInfo("Terminate", "A108", Rarity.COMMON, mage.cards.t.Terminate.class));
        cards.add(new SetCardInfo("Terramorphic Expanse", "A139", Rarity.COMMON, mage.cards.t.TerramorphicExpanse.class));
        cards.add(new SetCardInfo("Terror", "A50", Rarity.COMMON, mage.cards.t.Terror.class));
        cards.add(new SetCardInfo("Tranquil Thicket", "A140", Rarity.COMMON, mage.cards.t.TranquilThicket.class));
        cards.add(new SetCardInfo("Treva's Ruins", "A141", Rarity.UNCOMMON, mage.cards.t.TrevasRuins.class));
        cards.add(new SetCardInfo("Twisted Abomination", "A51", Rarity.COMMON, mage.cards.t.TwistedAbomination.class));
        cards.add(new SetCardInfo("Umezawa's Jitte", "B30", Rarity.RARE, mage.cards.u.UmezawasJitte.class));
        cards.add(new SetCardInfo("Vampiric Dragon", "A109", Rarity.RARE, mage.cards.v.VampiricDragon.class));
        cards.add(new SetCardInfo("Weathered Wayfarer", "B13", Rarity.RARE, mage.cards.w.WeatheredWayfarer.class));
        cards.add(new SetCardInfo("Werebear", "A87", Rarity.COMMON, mage.cards.w.Werebear.class));
        cards.add(new SetCardInfo("Wickerbough Elder", "A88", Rarity.COMMON, mage.cards.w.WickerboughElder.class));
        cards.add(new SetCardInfo("Wild Mongrel", "A89", Rarity.COMMON, mage.cards.w.WildMongrel.class));
        cards.add(new SetCardInfo("Willbender", "A33", Rarity.UNCOMMON, mage.cards.w.Willbender.class));
        cards.add(new SetCardInfo("Wirewood Guardian", "A90", Rarity.COMMON, mage.cards.w.WirewoodGuardian.class));
        cards.add(new SetCardInfo("Wood Elves", "A91", Rarity.UNCOMMON, mage.cards.w.WoodElves.class));
        cards.add(new SetCardInfo("Xira Arien", "A110", Rarity.RARE, mage.cards.x.XiraArien.class));
        cards.add(new SetCardInfo("Yavimaya Elder", "A92", Rarity.COMMON, mage.cards.y.YavimayaElder.class));
        cards.add(new SetCardInfo("Yavimaya Enchantress", "A93", Rarity.UNCOMMON, mage.cards.y.YavimayaEnchantress.class));
     }
}
